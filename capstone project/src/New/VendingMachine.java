package New;

import java.util.ArrayList;

public class VendingMachine {

    private final Product[] productList; //instead using arraylist, we use an array of Product objects


    private final int totalProducts; //used for totalProducts count


    public VendingMachine(int totalProducts) {
        this.totalProducts = totalProducts;
        this.productList = new Product[totalProducts]; //Initialize productList with size of totalProducts
    }


    public void insertProduct(int slot, Product product) throws IllegalAccessException {

        if (product == null) {
            throw new IllegalAccessException("A product can not be null");
        }
        if (slot > totalProducts) {
            throw new IllegalAccessException("Number of slot is greater than total slots in the vending machine");
        }
        if (slot -1 < 0) { //-1 because we use 0 index and checks if given slot is not less than what's allowed
            throw new IllegalAccessException("Undefined slot");
        }
        if (productList[slot -1] != null) { //checks if a given slot is not null
            throw new IllegalAccessException("there is already a product on the slot");
        }

        productList[slot -1] = product; //adds products to the VM

    }

    public Product getProduct (int index){
        return productList[index -1];
    }

    public int getTotalProducts() {
        return totalProducts;
    }

    public void removeProduct(int slot){
        productList[slot -1] = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VendingMachine{\n");
        for (int i = 0; i < productList.length; i++) { //iterate over the elements in the productList
            sb.append("  Slot ").append(i + 1).append(": ").append(productList[i]).append('\n');
        }
        sb.append("  totalProducts=").append(totalProducts).append('\n');
        sb.append('}');
        return sb.toString();
    }

}



