/**
 * Created by max on 10.03.16.
 */

import java.util.*;

public class Runner {
    public static void main(String[] args) {
    ArrayList<Pen> arrayPen = new ArrayList<>();
    Pen pen = new Pen ( "tarker" , 5);
    Pen pen1 = new Pen ( "yarker" , 7);
    Pen pen2 = new Pen ( "tarker" , 3);
    Pen pen3 = new Pen ( "parker" , 14);
    Pen pen4 = new Pen ( "parker" , 10);

        System.out.println("hello");
    arrayPen.add(pen1);
    arrayPen.add(pen);
    arrayPen.add(pen2);
    arrayPen.add(pen3);
    arrayPen.add(pen4);

    arrayPen.toArray();
    Collections.sort(arrayPen);
        for ( Pen  obj: arrayPen){
            System.out.println(obj);

        }

    System.out.println(arrayPen.size());
    }
}

