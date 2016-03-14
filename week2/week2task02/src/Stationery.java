/**
 * Created by max on 07.03.16.
 */
public class Stationery {
    private String name ;
    private int count;
    private double  price;

    public Stationery(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
