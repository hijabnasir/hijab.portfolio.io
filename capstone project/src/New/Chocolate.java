package New;

public class Chocolate extends Product implements PerishableDate{
    int temperature;
    String ExpirationDate;

    public Chocolate(String name, int price, String bestBeforeDate, int temperature, String expirationDate) {
        super(name, price, bestBeforeDate);
        this.temperature = temperature;
        this.ExpirationDate = expirationDate;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getExpirationDate() {
        return null;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "temperature=" + temperature +
                ", ExpirationDate='" + ExpirationDate + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bestBeforeDate='" + bestBeforeDate + '\'' +
                '}';
    }
}
