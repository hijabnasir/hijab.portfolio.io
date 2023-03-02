package AstNodes;

public class Substraktion extends AstNode {
    public AstNode left;
    public AstNode right;

    public Substraktion(AstNode left, AstNode right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " - " + right.toString();
    }
}
