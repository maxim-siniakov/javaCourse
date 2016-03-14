import java.util.ArrayList;

/**
 * Created by max on 08.03.16.
 */
public class Runner {
    public static void main(String[] args){
        Stationery pen = new Stationery("pen" , 4 , 13.4 );
        Record firstEmployee = new Record( new Employee("Den") , new Stationery("pen", 4 , 13.4), new Stationery("pencil", 3, 5),
                new Stationery("notebook" , 2 , 7.3));
        Record secondEmployee = new Record( new Employee("Jonh") , new Stationery("pen", 2 , 13.4), new Stationery("pencil", 7, 5),
                new Stationery("notebook" , 5 , 7.3));
//        Record second = new Record( Den , new Stationery("pencil", 2 , 6));
//        Record third = new Record ( Den , new Stationery("notebook" , 2 , 10));

        ArrayList<Record> records = new ArrayList<>();
        records.add(firstEmployee);
        records.add(secondEmployee);
        for ( Record  record: records) {
            record.showAllRecord();
        }



//        System.out.println( records.get(0).getS().getCount());
        System.out.println( records.get(0).retAllPrice());


    }
}

