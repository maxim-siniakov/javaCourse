import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by max on 08.03.16.
 */
public class Runner {
    public static void main(String[] args) {
        setOfbeginner setOfBeginner1 = new setOfbeginner(new Pen("noname", TypesOfPen.GEL, 5.5, 4)
                , new Pencil("noname", 12, TypesOfPencil.SOFT, 6, 5)
                , new Notebook("noname", 6, 10, 100, 2)
                , new Straightedge("noname", 10, 30, TypeOfEtc.IRON, 1));
        System.out.println(setOfBeginner1.getStraightedge().getCount());
        ArrayList<setOfbeginner> arrayset = new ArrayList<>();
        arrayset.add(setOfBeginner1);

        System.out.println(setOfBeginner1.toString());




        }
    }

