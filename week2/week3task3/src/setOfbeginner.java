/**
 * Created by max on 09.03.16.
 */
public class setOfbeginner {
    private Pen pen;
    private Pencil pencil;
    private Notebook notebook;
    private Straightedge straightedge;

    public setOfbeginner(Pen pen, Pencil pencil, Notebook notebook, Straightedge straightedge) {
        this.pen = pen;
        this.pencil = pencil;
        this.notebook = notebook;
        this.straightedge = straightedge;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Pencil getPencil() {
        return pencil;
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public Straightedge getStraightedge() {
        return straightedge;
    }

    public void setStraightedge(Straightedge straightedge) {
        this.straightedge = straightedge;
    }

    @Override
    public String toString() {
        return "setOfbeginner{" +
                "pen=" + pen +
                ", pencil=" + pencil +
                ", notebook=" + notebook +
                ", straightedge=" + straightedge +
                '}';
    }
}
