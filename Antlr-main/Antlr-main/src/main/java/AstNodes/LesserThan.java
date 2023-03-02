package AstNodes;

public class LesserThan extends AstNode {
    public AstNode left;
    public AstNode right;

    public LesserThan(AstNode left, AstNode right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
