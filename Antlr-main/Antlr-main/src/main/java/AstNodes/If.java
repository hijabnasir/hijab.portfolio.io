package AstNodes;

import java.util.List;

public class If extends AstNode {
    public AstNode condition;
    public List <AstNode> body;

    public If(AstNode condition, List<AstNode> body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString(){
        return "if " + condition + " then " + body;
    }
}


