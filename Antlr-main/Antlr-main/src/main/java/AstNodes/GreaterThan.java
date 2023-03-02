package AstNodes;

public class GreaterThan extends AstNode {

    public AstNode left;
    public AstNode right;

    public GreaterThan(AstNode left, AstNode right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}

