package AstNodes;
public class typeChecking extends AstNode {
    AstNode left;
    AstNode right;
    public typeChecking(AstNode left, AstNode right){
        this.left = left;
        this.right = right;
    }

    public Boolean expChecker(AstNode left, AstNode right){
        boolean leftCheck = false;
        try{
            Integer.parseInt(left.toString());
            leftCheck = true;
            Integer.parseInt(right.toString());
            return false;
        }catch (NumberFormatException e){
            try {
                if (leftCheck){
                    return true;
                }
                Double.parseDouble(left.toString());
                Double.parseDouble(right.toString());
                return false;
            }catch (NumberFormatException r){
                return true;
            }

        }
    }

    public Boolean defChecker(String type, Type value){
        boolean check = false;
        if (type.equals("int")){
            try{
                int x = Integer.parseInt(value.toString());
            }catch (NumberFormatException e){
               return true;
            }
        }
        if(type.equals("double")){
            try{
                double x = Double.parseDouble(value.toString());
            }catch (NumberFormatException e){
                return true;
            }
        }
        if(type.equals("txt")){
                String x = value.toString();
                if (x.indexOf('"') != 0){
                    return true;
                }
        }
        return check;
    }
}
    