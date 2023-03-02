package AstNodes;

public class Number extends AstNode {
    public Type num;

    public Number(Type num){
        this.num = num;
    }

    @Override
    public String toString(){
        return num.toString();
    }




}
