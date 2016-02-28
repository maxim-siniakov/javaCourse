/**
 * Created by max on 26.02.16.
 */
public class Runner {
    public static void main(String[ ] args){
        double[] array = new double [] { 4, 3 , 31, 24, 8, 1 , 2 , 4 , 3, 2, 1,7};
//        System.out.println(array.length);
        double [] arrayFinal = new double [array.length/2];
        for ( int i = 0 ; i < (array.length / 2) ; i++){
            arrayFinal[i] = array[i]+ array[(array.length)-1- i ];
        }
        double maxPairs = 0;
        for ( double num : arrayFinal){
           if (num > maxPairs){
               maxPairs = num;
           }
        }
      System.out.println( maxPairs);


    }
}
