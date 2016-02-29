/**
 * Created by max on 28.02.16.
 */
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        String e;
        int n = 0;
        double a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert number N:");
        n = sc.nextInt();
        System.out.println("please insert epsil");
        e = sc.next();
        double epsil = Double.valueOf(e);
        double minValue = 0;
        int min = 0;
        for (int i = 1; i < n; i++) {

            a = 1.0 / ((i + 1) * (i + 1));
            if (min == 0 & a < epsil) {
                min = i;
                System.out.println(a);
            } else {
                System.out.println(a);
            }

        }
        System.out.println("minimal number of  element of sequense: " + min);

    }
}