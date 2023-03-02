package New;
// NAME: Hijab Nasir                                 AAU Mail: hnasir20@student.aau.dk
public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Welcome to the vending machine");

        VendingMachine vendingMachine = new VendingMachine(20);

        Product coke = new Product("coke", 25, "23-11-2023");



        Product water = new Product("water", 15, "20-05-2024");

        Product kitKat = new Chocolate("Kitkat", 25,"10-01-2023", -5, "20-12-2023");
        Product white = new Chocolate("white", 30, "22-12-2025", -5,"11-11-2023");

        Product BBQChicken = new Pizza("BBQChicken", 99, "23-10-2022","25-10-2022");
        Product pizzaYum = new Pizza("pizzaYum", 77, "23-10-2022", "25-10-2022");

        Product spicy = new Chips("spicyChip", 30, "20-01-2024", "Spicy");
        Product Pringles = new Chips("Pringles", 35, "21-04-2023", "Pringles");



        vendingMachine.insertProduct(10, coke);
        vendingMachine.insertProduct(8, water);
        vendingMachine.insertProduct(2,kitKat);
        vendingMachine.insertProduct(9,white);
        vendingMachine.insertProduct(4, BBQChicken);
        vendingMachine.insertProduct(18,pizzaYum);
        vendingMachine.insertProduct(6,spicy);
        vendingMachine.insertProduct(19,Pringles);


        System.out.println(vendingMachine);
        vendingMachine.removeProduct(8); //only if you want to remove a product

        //System.out.println(vendingMachine.getProduct(10).name);
        //System.out.println(vendingMachine.getProduct(10));


    }
}
