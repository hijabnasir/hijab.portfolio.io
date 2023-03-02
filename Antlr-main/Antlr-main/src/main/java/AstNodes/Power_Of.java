package AstNodes;

public class Power_Of extends AstNode {
    public AstNode left;
    public AstNode right;

    public Power_Of(AstNode left, AstNode right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " ^ " + right.toString();
    }
}
