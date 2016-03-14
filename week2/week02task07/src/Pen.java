import java.lang.annotation.Documented;

/**
 * Created by max on 14.03.16.
 */


@About(
        Author = "Max",
        dayOfWeek = "Sunday"
)


public class Pen {
    private String name ;
    private int  price ;

    public Pen(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
