package AstNodes;

import java.util.List;

public class While extends AstNode {
    public AstNode condition;
    public List <AstNode> body;

    public While(AstNode condition, List<AstNode> body){
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString(){
        return "while " + condition + " do " + body;
    }

}
