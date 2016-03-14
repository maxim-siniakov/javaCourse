import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/**
 * Created by max on 07.03.16.
 */
public class Record {
    private Employee emp;
    private Stationery pens;
    private Stationery pencils;
    private Stationery notebooks;
    private double mainprice;

    public Record(Employee emp, Stationery pens, Stationery pencils,
                  Stationery notebooks) {
        this.emp = emp;
        this.pens = pens;
        this.pencils = pencils;
        this.notebooks = notebooks;

    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Stationery getPens() {
        return pens;
    }

    public void setPens(Stationery pens) {
        this.pens = pens;
    }

    public Stationery getPencils() {
        return pencils;
    }

    public void setPencils(Stationery pencils) {
        this.pencils = pencils;
    }

    public Stationery getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(Stationery notebooks) {
        this.notebooks = notebooks;
    }

    public void showAllRecord( ){
        System.out.print("Employee's name :" +getEmp().getName()+ "\t");
        System.out.print("Pen's name :"+ getPens().getName()+ "\t");
        System.out.print("Pen's count :"+getPens().getCount()+ "\t");
        System.out.print("Pen's prices :"+getPens().getPrice()+ "\t");
        System.out.print("Pen's name :"+getPencils().getName()+ "\t");
        System.out.print("Pen's count :"+getPencils().getCount()+ "\t");
        System.out.print("Pen's prices :"+getPencils().getPrice()+ "\t");
        System.out.print("Notebook's name :"+getNotebooks().getName()+ "\t");
        System.out.print("Notebook's count :"+getNotebooks().getCount()+ "\t");
        System.out.print("Notebook's prices :"+getNotebooks().getPrice()+ "\t");
        System.out.print("All prices" +retAllPrice());
        System.out.println();
    }
    public double retAllPrice() {
        mainprice = pens.getPrice() * pens.getCount() + pencils.getCount() * pencils.getPrice() +
                +notebooks.getCount() * notebooks.getCount();
        return mainprice;
    }

}

