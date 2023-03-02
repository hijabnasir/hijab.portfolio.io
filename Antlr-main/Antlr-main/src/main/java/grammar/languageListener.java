// Generated from C:/Users/thetr/Desktop/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(languageParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(languageParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#entrypoint}.
	 * @param ctx the parse tree
	 */
	void enterEntrypoint(languageParser.EntrypointContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#entrypoint}.
	 * @param ctx the parse tree
	 */
	void exitEntrypoint(languageParser.EntrypointContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(languageParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(languageParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(languageParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(languageParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(languageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(languageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(languageParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(languageParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(languageParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(languageParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#type_reassign}.
	 * @param ctx the parse tree
	 */
	void enterType_reassign(languageParser.Type_reassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#type_reassign}.
	 * @param ctx the parse tree
	 */
	void exitType_reassign(languageParser.Type_reassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(languageParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(languageParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(languageParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(languageParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(languageParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(languageParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(languageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(languageParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bigger_expression}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBigger_expression(languageParser.Bigger_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bigger_expression}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBigger_expression(languageParser.Bigger_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualWith}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualWith(languageParser.EqualWithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualWith}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualWith(languageParser.EqualWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(languageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(languageParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserorEqualThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLesserorEqualThan(languageParser.LesserorEqualThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserorEqualThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLesserorEqualThan(languageParser.LesserorEqualThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotEqualWith}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotEqualWith(languageParser.IsNotEqualWithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotEqualWith}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotEqualWith(languageParser.IsNotEqualWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLesserThan(languageParser.LesserThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLesserThan(languageParser.LesserThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(languageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(languageParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(languageParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(languageParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power_of}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPower_of(languageParser.Power_ofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power_of}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPower_of(languageParser.Power_ofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(languageParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(languageParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterorEqualThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterorEqualThan(languageParser.GreaterorEqualThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterorEqualThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterorEqualThan(languageParser.GreaterorEqualThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(languageParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(languageParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(languageParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(languageParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Else}
	 * labeled alternative in {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse(languageParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Else}
	 * labeled alternative in {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse(languageParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(languageParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(languageParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#iterative_statement}.
	 * @param ctx the parse tree
	 */
	void enterIterative_statement(languageParser.Iterative_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#iterative_statement}.
	 * @param ctx the parse tree
	 */
	void exitIterative_statement(languageParser.Iterative_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(languageParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(languageParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(languageParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(languageParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#forever_loop}.
	 * @param ctx the parse tree
	 */
	void enterForever_loop(languageParser.Forever_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#forever_loop}.
	 * @param ctx the parse tree
	 */
	void exitForever_loop(languageParser.Forever_loopContext ctx);
}