package AstNodes;

public class Addition extends AstNode {
    public AstNode left;
    public AstNode right;

    public Addition(AstNode left, AstNode right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " + " + right.toString();
    }
}
