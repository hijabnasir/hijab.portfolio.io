package AstNodes;

public class Variable extends AstNode {

    public String id;

    public Variable(String id){
        this.id = id;
    }

    public String toString(){
        return id;
    }
}
