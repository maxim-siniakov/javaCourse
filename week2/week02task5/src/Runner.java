import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.ArrayList;

/**
 * Created by max on 11.03.16.
 */
public class Runner {
    public static void main ( String [ ] args){
        Student Tokunova =  new Student("Lubov");
        Student Max =  new Student("Max");
        Tokunova.addToGroup(new Discipline<>(Disciplines.BIOLOGY , TypeOfScore.FLOAT)) ;
        Tokunova.addToGroup(new Discipline<>(Disciplines.MATH , TypeOfScore.IN)) ;
        Tokunova.addToGroup(new Discipline<>(Disciplines.PHYSICS , TypeOfScore.FLOAT)) ;
        Max.addToGroup(new Discipline(Disciplines.MATH , TypeOfScore.IN)) ;
        Max.showGroups();
        Max.addScore( Disciplines.MATH,  4);
        Max.addScore( Disciplines.MATH,  5);
        Tokunova.addScore(Disciplines.BIOLOGY , 4.0);
        Tokunova.addScore(Disciplines.BIOLOGY , 5.0);
        Tokunova.addScore(Disciplines.BIOLOGY , 5.0);
        Tokunova.addScore(Disciplines.MATH , 4);
        Tokunova.addScore(Disciplines.MATH , 5.0); // здесь выдаст сообщение
        Tokunova.addScore(Disciplines.PHYSICS , 5.0);
        Max.showScores(Disciplines.MATH );
        Tokunova.showScores(Disciplines.MATH );
        Tokunova.showScores(Disciplines.BIOLOGY );
    }
}
