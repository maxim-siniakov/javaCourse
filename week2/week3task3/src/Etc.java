/**
 * Created by max on 08.03.16.
 */

/**
 * класс который можно условно назвать "прочее", к нему относятся такие предметы как: кнопки, степлер, резинка и прочее.
 */
public abstract class Etc extends Stationery {
    private final boolean etc;
    public Etc(String name, double price , int count) {
        super(name, price, count);
        this.etc = true;
    }

    public boolean isEtc() {
        return etc;
    }
    public boolean isPaper() {
        return false;
    }
    public boolean isWriting() {
        return false;
    }
}
