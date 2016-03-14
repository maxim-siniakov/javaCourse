import java.util.*;
/**
 * Created by max on 11.03.16.
 */
public class Student <T2> {
    private String name;
    Map<Discipline, ArrayList<Number>> disciplineAndScores;

    public Student(String name) {
        this.name = name;
        disciplineAndScores = new HashMap<>();
    }

    public void addToGroup(Discipline dis) {
        disciplineAndScores.put(dis, new ArrayList<Number>());
    }

    public void showGroups() {
        Set sets = disciplineAndScores.keySet();
        for (Object set : sets) {
            System.out.println(((Discipline) set).getType());
        }
    }

    /**
     * Если указан не тот формат, который указан в объекте, то оценка не добавится в пул и будет выведено сообщение.
     **/
    public <T extends Number> void addScore (Disciplines disciplines , T score ) {
        Set sets = disciplineAndScores.keySet();
        for (Object set : sets) {
            Discipline type = (Discipline) set;
            if (type.getType() == disciplines) {

                if ((score instanceof Double == true || score instanceof Float == true) &&
                        type.getTypeOfScore() == TypeOfScore.FLOAT) {
                    disciplineAndScores.put(type, disciplineAndScores.get(type)).add(score);
                } else if ((score instanceof Integer == true) &&
                        type.getTypeOfScore() == TypeOfScore.IN) {
                    disciplineAndScores.put(type, disciplineAndScores.get(type)).add(score);
                } else {
                    System.out.println(" you entered are wrong format for this discipline" );
                }
            }
        }
    }


    public void showScores (Disciplines disciplines ){
        Set sets = disciplineAndScores.keySet();
        for ( Object set : sets ){
            Discipline type = (Discipline) set;
            if( type.getType() == disciplines){
                System.out.println(disciplineAndScores.get(type));


            }
        }
    }


}
