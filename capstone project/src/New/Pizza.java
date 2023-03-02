package New;

public class Pizza extends Product implements PerishableDate{

    String ExpirationDate;

    public Pizza(String name, int price, String bestBeforeDate, String expirationDate) {
        super(name, price, bestBeforeDate);
        this.ExpirationDate = expirationDate;
    }

    @Override
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ExpirationDate='" + ExpirationDate + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bestBeforeDate='" + bestBeforeDate + '\'' +
                '}';
    }
}
