package AstNodes;

import java.util.List;

public class If_else extends AstNode {
    public AstNode condition;
    public List<AstNode> body;
    public List<AstNode> Else;


    public If_else(AstNode condition, java.util.List<AstNode> body, List<AstNode> Else) {
        this.condition = condition;
        this.body = body;
        this.Else = Else;
    }
    public String toString(){
        return "if " + condition + " then " + body + " else " + Else;
    }
}
