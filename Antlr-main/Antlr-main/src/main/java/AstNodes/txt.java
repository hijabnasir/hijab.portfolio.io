package AstNodes;

public class txt extends AstNode {
    public Type string;

    public txt(Type string){
        this.string = string;
    }

    @Override
    public String toString(){
        return string.toString();
    }
}
