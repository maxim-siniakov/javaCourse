import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.*;
import java.util.Scanner;
/**
 * Created by max on 26.02.16.
 */
public class Runner {
    public static void main(String[] args) {
        double tg = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter left number");
        String y = s.next();
        double a = Double.valueOf(y);
//        System.out.println( x + a );
        System.out.println("please enter right number");
         y = s.next();
        double b = Double.valueOf(y);
        System.out.println("please enter step");
         y = s.next();
        double h = Double.valueOf(y);

        while ( a <= b){
            tg = Math.tan(2*a)-3;
            System.out.format( " valua a is  %.1f| f(x)= tg(2x)-3 = %.3f" ,a , tg);//+"|"+(Math.tan(2*a) - 3 ));
            a += h;
            System.out.println();
        }

    }
}