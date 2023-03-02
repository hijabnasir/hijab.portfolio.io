package AstNodes;

public class EqualWith extends AstNode {
    public AstNode left;
    public AstNode right;

    public EqualWith(AstNode left, AstNode right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
