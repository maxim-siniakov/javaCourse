/**
 * Created by max on 27.02.16.
 */
import java.util.Scanner;
import java.lang.StringBuilder;

public class Notebook {
    int size;
    private String[] arrayOfRecords;
    private String record;
    Notebook( ){
        this.size = 0;
        arrayOfRecords = new String[size];
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setRecord(String record) {
        this.record = record;
    }
    public String getRecord() {
        return record;
    }

    /**
     * <p>Метод добавляет запись в объект блокнот
     * после вызова вы укажите название записи, кототую метод добавит в массив записей.
     * Запись добавится в конец массива</p>
     */
    public void  addRecord(){
        System.out.println("please enter a record");
        Scanner sc = new Scanner(System.in);
        String record = sc.next();
        setSize(size + 1 );
        String [] b = arrayOfRecords;
        arrayOfRecords = new String [getSize()];
      /*  for ( int i = 0 ; i < b.length; i++){
            arrayOfRecords[i] = b[i];
        }*/
        System.arraycopy(b, 0, arrayOfRecords, 0 ,b.length);
        arrayOfRecords[arrayOfRecords.length -1 ] = record;
    }

    /**
     * <p>Метод меняет запись в блокноте. После вызова функции, вас попросят ввести номер записи,
     * которую вы хотите поменять</p>
     */
    public void changeRecord(){
        System.out.println( "Notebook has :" + arrayOfRecords.length + "records");
        System.out.println( "please enter number of element which you wanna change");
        Scanner sc = new Scanner ( System.in );
        int x = sc.nextInt();
        System.out.println( "the element contain next string:" + " "+ arrayOfRecords[x]);
        System.out.println( "Now enter a new string ");
        String newRecord =  sc.next();
        arrayOfRecords[x] = newRecord;
    }

    /*
    public void change(int record_id, String new_record)
    {
        records[record_id] = new_record;
    }
    */

    /**
     * Метод показывает все записи, которые представлены на текущий момент в блокноте.
     */
    public void showAllRecords ( ){
        for ( int i = 0 ; i < arrayOfRecords.length; i++){
            System.out.print( arrayOfRecords[i] + '\t');
        }
        System.out.println();
    }

    /**
     * <p>Метод удаляет запись из блокнота. При вызове метода вам нужно указать номер записи,
     * которую вы хотите удалить </p>
     */
    public void deleteRecord( ) {
        System.out.println("please enter number of element which you wanna delete");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        String[] array1 = new String[arrayOfRecords.length - 1];
        if (x == 0) {
            String[] array1 = new String[arrayOfRecords.length - 1];
            System.arraycopy(arrayOfRecords, 1, array1, 0, arrayOfRecords.length - 1);
            arrayOfRecords = new String[array1.length];
            arrayOfRecords = array1;
        } else if (x == arrayOfRecords.length - 1) {
            String[] array1 = new String[arrayOfRecords.length - 1];
            System.arraycopy(arrayOfRecords, 0, array1, 0, arrayOfRecords.length - 1);
            arrayOfRecords = new String[array1.length];
            arrayOfRecords = array1;
        } else if (x > 0 && x < arrayOfRecords.length -1){
            int sizeOfMainArray = arrayOfRecords.length;
            String[] array2 = new String[x];
            String[] array3 = new String[arrayOfRecords.length - (x+1)];
            System.arraycopy(arrayOfRecords, 0, array2, 0, array2.length);
            System.arraycopy(arrayOfRecords, x + 1, array3, 0, array3.length);
            arrayOfRecords = new String[sizeOfMainArray - 1];
            System.arraycopy(array2, 0, arrayOfRecords, 0, array2.length);
            System.arraycopy(array3, 0, arrayOfRecords, array2.length, array3.length);
        }
        else{
            System.out.println("not good choise");
        }
    }
    public static void main( String [] args){
        Notebook notebook = new Notebook();

/**
 * <p>При запуске программы перед вами появится меню, где вам нужно будет выбрать один из пунктов.
 * Каждый пункет меню представляет собой метод, который прозводит операции над объектом блокнот.</p>
 */
    int choise = 0 ;
        do {
            System.out.println("[1]add record");
            System.out.println("[2]delete record");
            System.out.println("[3] show records");
            System.out.println("[4] change record");
            System.out.println("[5] quit");

            System.out.println("Please enter a number");
            Scanner sc = new Scanner( System.in);
            choise = sc.nextInt();
            switch ( choise ){
                case 1:
                   notebook.addRecord();
                   break;
                case 2:
                    notebook.deleteRecord();
                    break;
                case 3:
                    notebook.showAllRecords();
                    break;
                case 4:
                    notebook.changeRecord();
                    break;
                case 5:
                    break;
                default:
                    System.out.println (" Choise is incorrect");
                    break;
            }
        }
        while ( choise != 5);



       // System.out.println(notebook.arrayOfRecords[0]);
    }
}
