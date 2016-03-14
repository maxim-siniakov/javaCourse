/**
 * Created by max on 08.03.16.
 */
public class Straightedge  extends Etc{
    private double length;
    private TypeOfEtc type;
    public Straightedge(String name, double price, double length, TypeOfEtc type , int count) {
        super(name, price , count);
        this.length = length;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Straightedge{" +
                "price="+ this.getPrice()+
                "length=" + length +
                ", type=" + type +
                '}';
    }

    //    @Override
//    public boolean isWriting() {
//        return false;
//    }


//    public boolean isPaper() {
//        return false;
//    }

}
