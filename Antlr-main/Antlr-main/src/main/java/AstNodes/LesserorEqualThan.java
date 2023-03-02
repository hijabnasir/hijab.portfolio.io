package AstNodes;

public class LesserorEqualThan extends AstNode {
    public AstNode left;
    public AstNode right;

    public LesserorEqualThan(AstNode left, AstNode right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
