package New;

public class Chips extends Product{
    String flavor;

    public Chips(String name, int price, String bestBeforeDate, String flavor) {
        super(name, price, bestBeforeDate);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "flavor='" + flavor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bestBeforeDate='" + bestBeforeDate + '\'' +
                '}';
    }
}


