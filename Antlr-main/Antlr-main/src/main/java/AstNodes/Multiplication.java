package AstNodes;

public class Multiplication extends AstNode {
    public AstNode left;
    public AstNode right;

    public Multiplication(AstNode left, AstNode right){
        this.left = left;
        this.right = right;

    }

    @Override
    public String toString(){

        return left.toString() + " * " + right.toString();
    }
}
