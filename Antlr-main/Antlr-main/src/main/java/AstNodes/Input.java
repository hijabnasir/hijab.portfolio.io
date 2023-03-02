package AstNodes;

public class Input extends AstNode {
    public AstNode body;

    public Input(AstNode body){
        this.body = body;
    }

    @Override
    public String toString(){
        return body.toString();
    }
}
