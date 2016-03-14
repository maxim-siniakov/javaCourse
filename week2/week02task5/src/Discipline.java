import java.util.ArrayList;
import java.util.Enumeration;

/**
 * Created by max on 11.03.16.
 */
public class Discipline <T1 , T2 extends Number>  {
    private T1 type;
    private TypeOfScore typeOfScore;
    public Discipline(T1 type  , TypeOfScore typeOfScore) {
        this.type = type;
        this.typeOfScore = typeOfScore;

    }
    public T1 getType() {
        return type;
    }

    public void setType(T1 type) {
        this.type = type;
    }

    public TypeOfScore getTypeOfScore() {
        return typeOfScore;
    }

    public void setTypeOfScore(TypeOfScore typeOfScore) {
        this.typeOfScore = typeOfScore;
    }
}
