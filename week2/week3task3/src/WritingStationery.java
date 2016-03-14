/**
 * Created by max on 08.03.16.
 */

/**
 * абстрактный класс, который описывает канцтовары, которыми пишут: карандаш, ручка и прочее.
 */
public abstract class  WritingStationery extends Stationery {
    private final boolean writing;

    public WritingStationery(String name, double price , int count) {
        super(name, price, count);
        writing = true;
    }




    public boolean isWriting() {
        return writing;
    }

    public boolean isPaper() {
        return false;
    }

    public boolean isEtc() {
        return false;
    }
}

