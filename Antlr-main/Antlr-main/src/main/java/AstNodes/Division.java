package AstNodes;

public class Division extends AstNode {
    public AstNode left;
    public AstNode right;

    public Division(AstNode left, AstNode right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " / " + right.toString();
    }
}
