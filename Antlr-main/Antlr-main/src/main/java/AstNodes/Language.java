package AstNodes;

import java.util.ArrayList;
import java.util.List;

public class Language {
    public List<AstNode> astNodes;


    public Language(){
        this.astNodes = new ArrayList<>();
    }

    public void addExpression(AstNode e){
        astNodes.add(e);
    }
}
