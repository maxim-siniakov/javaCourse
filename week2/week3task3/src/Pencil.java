/**
 * Created by max on 08.03.16.
 */
public  class Pencil extends  WritingStationery{
    private TypesOfPencil type;
    private int number;

    public Pencil(String name, double price, TypesOfPencil type, int number,int count ) {
        super(name, price , count);
        this.type = type;
        this.number = number;

    }

    @Override
    public String toString() {
        return "Pencil{" +"Name: " + super.getName() +
                "   type=" + type +
                "   number=" + number +
                '}';
    }
}
