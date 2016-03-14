/**
 * Created by max on 08.03.16.
 */
public class Notebook extends PaperStationery {
    public Notebook(String name, double price, double size, int pages, int count) {
        super(name, price, size, pages,count);
    }

    @Override
    public boolean isWriting() {
        return false;
    }


}

