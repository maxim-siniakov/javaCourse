/**
 * Created by max on 08.03.16.
 */

/**
 * абстрактный класс канцтовар.
 */
public abstract class Stationery {
    private String name;
    private double price;
    private int count;

    public Stationery(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public abstract boolean isWriting();
    public abstract boolean isPaper();
    public abstract boolean isEtc();

}
