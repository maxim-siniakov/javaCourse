/**
 * Created by max on 08.03.16.
 */

/**
 * абстрактный класс, который описывает канцтовары на которых пишут: бумага, блокноты и прочее.
 */
public abstract class PaperStationery extends Stationery {
    private final boolean paper;
    private double size;
    private int pages;

    public PaperStationery(String name, double price, double size,int pages , int count ) {
        super(name, price, count);
        paper = true;
        this.size = size;
        this.pages = pages;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isPaper() {
        return paper;
    }
    public boolean isWriting() {
        return false;
    }
    public boolean isEtc() {
        return false;
    }

    @Override
    public String toString() {
        return "PaperStationery{" +
                "pages=" + pages +
                ", size=" + size +
                ", paper=" + paper +
                '}';
    }
}
