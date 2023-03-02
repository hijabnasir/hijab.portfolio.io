package New;

public class Product implements NonPerishableDate {
    String name;
    int price;
    String bestBeforeDate;

    public Product(String name, int price, String bestBeforeDate) {
        this.name = name;
        this.price = price;
        this.bestBeforeDate = bestBeforeDate;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getBestBeforeDate() {
        return this.bestBeforeDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", bestBeforeDate='" + bestBeforeDate + '\'' +
                '}';
    }
}
