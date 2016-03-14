/**
 * Created by max on 10.03.16.
 */
import java.util.Comparator;
public class Pen implements Comparable<Pen>{
    private String name;
    private double price;

    public Pen(){};
    public Pen(String name, double price) {
        this.name = name;
        this.price = price;
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
    public int compareTo(Pen obj) { // сортирует по имени и по цене,
        Pen entry = (Pen) obj;
        int resul = this.getName().compareTo(entry.getName());
        if( resul != 0 ){
            return resul;
        }
        int res;
        double result = price - entry.getPrice();
        if ( result > 0){
           return  res = (int) result + 1;
        }
        else if ( result < 0 ){
          return  res = (int) result - 1;
        }
        else{
            res = 0;
        }
        return res;

    }


    // Сортирует только  по имени
//    @Override
//public int compareTo(Pen obj) {
//        Pen entry = (Pen) obj;
//        int result = this.getName().compareTo(entry.getName());
//        if( result != 0 ){
//            return result;
//        }
//            return 0;
//    }
//

    //Сортирует только по цене
//    @Override
//    public int compareTo(Pen obj) {
//        Pen entry = (Pen) obj;
//        int res;
//        double result = price - entry.getPrice();
//        if ( result > 0){
//            res = (int) result + 1;
//        }
//        else if ( result < 0 ){
//            res = (int) result - 1;
//        }
//        else{
//            res = 0;
//        }
//        return res;
//
//    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
