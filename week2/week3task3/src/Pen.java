/**
 * Created by max on 08.03.16.
 */
public class Pen extends WritingStationery {
   private TypesOfPen type;
   public Pen(String name, TypesOfPen type,  double price , int count) {
        super(name, price, count);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pen{" + "name:  " +super.getName()+
                "   type=" + type +
                "   price" +super.getPrice() +

                '}';
    }
}
