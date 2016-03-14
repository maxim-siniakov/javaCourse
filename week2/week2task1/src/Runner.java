/**
 * Created by max on 07.03.16.
 */
public class Runner {
    public static void main(String[] args) {
        Pen pen = new Pen("Parker", typePen.ballPen, 34.5);
        Pen pen1 = new Pen();
       System.out.println( pen.toString());
       pen1.setType(typePen.gelPen);
        System.out.println( pen1.toString());
    }
}