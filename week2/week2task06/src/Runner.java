/**
 * Created by max on 10.03.16.
 */
import java.lang.annotation.*;

public class Runner {
    public static void main ( String [ ] args) {
       AtomicBomb boat = new AtomicBomb( 120 , madeInCountry.Russia , 40 );
       System.out.println(boat.checkSwim());
        boat.boatIsRunning();
        System.out.println(boat.checkSwim());
        boat.boatIsStopped();
        System.out.println(boat.checkSwim());
        System.out.println();
        boat.getEngage().setHP(30);
        System.out.println(boat.getEngage().getHP());

    }
}
