package AstNodes;

public class VariableReDeclaration extends AstNode {
    public String id;
    public AstNode astNode;

    public VariableReDeclaration(String id, AstNode astNode){
        this.id = id;
        this.astNode = astNode;
    }

    @Override
    public String toString(){
        return astNode.toString();
    }

}
