package AstNodes;

import java.util.List;

public class Forever_Loop extends AstNode {
    public List<AstNode> body;

    public Forever_Loop(List<AstNode> body){
        this.body = body;
    }

    @Override
    public String toString(){
        return "forever: {"  + body + "}";
    }
}
