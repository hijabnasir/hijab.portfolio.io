package AstNodes;

public class isNotEqualWith extends AstNode {
    public AstNode left;
    public AstNode right;

    public isNotEqualWith(AstNode left, AstNode right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
