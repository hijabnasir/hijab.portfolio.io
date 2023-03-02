package AstNodes;

public class Print extends AstNode {
    public AstNode body;

    public Print(AstNode body){
        this.body = body;
    }

    @Override
    public String toString(){

        return "print " + body;
    }
}
