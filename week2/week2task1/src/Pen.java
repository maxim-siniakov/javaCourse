import java.util.Objects;

/**
 * Created by max on 07.03.16.
 */
public class Pen {
    private String companyName;
    private typePen type;
    private double price;

    public Pen( ){};

    public Pen(String companyName, typePen type, double price) {
        this.companyName = companyName;
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.getPrice(), getPrice()) == 0 &&
                Objects.equals(getCompanyName(), pen.getCompanyName()) &&
                getType() == pen.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompanyName(), getType(), getPrice());
    }

    @Override
    public String toString() {
        return "Pen{" +
                "companyName='" + companyName + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }

    public void setCompanyName(String companyName) {

        this.companyName = companyName;
    }

    public void setType(typePen type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompanyName() {

        return companyName;
    }

    public typePen getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
