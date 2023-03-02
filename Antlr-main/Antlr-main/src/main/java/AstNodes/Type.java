package AstNodes;

public class Type {
    private final Object type;

    public Type(Object a){
        this.type = a;
    }

    @Override
    public String toString(){
        return type.toString();
    }
}


