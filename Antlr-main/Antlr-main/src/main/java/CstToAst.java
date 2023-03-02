import AstNodes.Number;
import AstNodes.*;
import grammar.languageBaseVisitor;
import grammar.languageParser;

import java.util.*;

public class CstToAst extends languageBaseVisitor<AstNode> {

    private List<String> vars; //Stores all variables that are declared in the program
    private List<String> semanticErrors; //Duplicate declaration, Reference to undeclared
    private List<String> typeErrors;
    private Map<String, Type> Values;
    public CstToAst(List<String> semanticErrors, List<String> typeErrors) {
        vars = new ArrayList<>();
        Values = new HashMap<>();
        this.semanticErrors = semanticErrors;
        this.typeErrors = typeErrors;
    }

    @Override
    public AstNode visitAddition(languageParser.AdditionContext ctx) { //we visit left and right node of addition expression 
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Addition node
        AstNode right = visit(ctx.getChild(2)); // recursively visit the right subtree of the current Addition node
        typeChecking check = new typeChecking(left, right); //doing type checking 
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Addition(left, right); // its a astnode
    }

    @Override
    public AstNode visitSubstraktion(languageParser.SubstraktionContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Substraktion(left, right);
    }

    @Override
    public AstNode visitMultiplication(languageParser.MultiplicationContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Multiplication(left, right);
    }

    @Override
    public AstNode visitDivision(languageParser.DivisionContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Division(left, right);
    }

    @Override
    public AstNode visitPower_of(languageParser.Power_ofContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Power_Of(left, right);
    }

    @Override
    public AstNode visitVariable(languageParser.VariableContext ctx) {
        String id = ctx.getChild(0).getText();
        if(!vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " not declared");
        }
        return new Variable(id);
    }

    @Override
    public AstNode visitNumber(languageParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        Type num = new Type(numText);
        return new Number(num);
    }

    @Override public AstNode visitString(languageParser.StringContext ctx) {
        String txtText = ctx.getChild(0).getText();
        Type txt = new Type(txtText);
        return new txt(txt);
    }

    @Override
    public AstNode visitIf(languageParser.IfContext ctx) {
        AstNode condition = visit(ctx.getChild(2));
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        return new If(condition, bodyList);
    }

    @Override
    public AstNode visitElse(languageParser.ElseContext ctx) {
        AstNode condition = visit(ctx.getChild(2));
        List<AstNode> bodyList = new ArrayList<>();
        List<AstNode> elseList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        for (int i = 0; i < ctx.getChild(9).getChildCount(); i++){
            elseList.add(visit(ctx.getChild(9).getChild(i)));
        }

        return new If_else(condition, bodyList, elseList);
    }

    @Override
    public AstNode visitBreak_statement(languageParser.Break_statementContext ctx) {
        return new Break();
    }


    @Override
    public AstNode visitFor_loop(languageParser.For_loopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AstNode visitWhile_loop(languageParser.While_loopContext ctx) {
        AstNode condition = visit(ctx.getChild(2));
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        return new While(condition, bodyList);
    }

    @Override
    public AstNode visitForever_loop(languageParser.Forever_loopContext ctx) {
        ArrayList<AstNode> bodyList = new ArrayList<>();
            for (int i = 0; i < ctx.getChild(2).getChildCount(); i++) { //looper på getchild 2, hvor vi få antal af stmts
                bodyList.add(visit(ctx.getChild(2).getChild(i)));
            }
        return new Forever_Loop(bodyList); //denne her et astnode
        }


    @Override
    public AstNode visitPrint(languageParser.PrintContext ctx) {
        AstNode body = visit(ctx.getChild(2));
        return new Print(body);
    }

    @Override
    public AstNode visitInput(languageParser.InputContext ctx){
        String id = ctx.getChild(2).getText();
        vars.add(id);
        AstNode body = visit(ctx.getChild(2));

        return new Input(body);
    }

    @Override
    public AstNode visitType_declaration(languageParser.Type_declarationContext ctx) {
        String id = ctx.getChild(1).getText();
        Type value = new Type(ctx.getChild(3).getText());
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared ");
        } else {
            vars.add(id);
            Values.put(id, value);
        }
        String type = ctx.getChild(0).getText();
        typeChecking check = new typeChecking(null, null);
        if(check.defChecker(type, value)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }else{
            System.out.print("TYPE DEF " + id + " " + type + " " + value + "\n");
        }
        return new VariableDeclaration(id, type, value);
    }

    @Override
    public AstNode visitType_reassign(languageParser.Type_reassignContext ctx) {
        String id = ctx.getChild(0).getText();
        AstNode astNode = visit(ctx.getChild(2));
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " not declared ");
        }
        System.out.print("TYPE RE-DEF OF " + id + " TO " + astNode + "\n");
        return new VariableReDeclaration(id, astNode);
    }

    @Override
    public AstNode visitFunction_declaration(languageParser.Function_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AstNode visitParam(languageParser.ParamContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AstNode visitGreaterThan(languageParser.GreaterThanContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new GreaterThan(left, right);
    }


    @Override
    public AstNode visitLesserThan(languageParser.LesserThanContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new LesserThan(left, right);
    }

    @Override
    public AstNode visitEqualWith(languageParser.EqualWithContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new EqualWith(left, right);
    }

    @Override
    public AstNode visitGreaterorEqualThan(languageParser.GreaterorEqualThanContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new GreaterorEqualThan(left, right);
    }


    @Override
    public AstNode visitLesserorEqualThan(languageParser.LesserorEqualThanContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new LesserorEqualThan(left, right);
    }

    @Override
    public AstNode visitIsNotEqualWith(languageParser.IsNotEqualWithContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new isNotEqualWith(left, right);
    }
}

