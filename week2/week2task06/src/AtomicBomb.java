/**
 * Created by max on 10.03.16.
 */
public class AtomicBomb {
    private int size;
    private madeInCountry country;
    private double maxSpeed;
    private Engage engage;

    public AtomicBomb(int size, madeInCountry country, double maxSpeed) {
        this.size = size;
        this.country = country;
        this.maxSpeed = maxSpeed;
        this.engage = new Engage();
        }

    class Engage{
        private int HP;
        private boolean engageIsWorks;
        Engage() {
            this.HP = HP;
            engageIsWorks = false;
        }

        public boolean engageOn ( ){
            engageIsWorks = true;
            return engageIsWorks;
        }
        public boolean engageOff ( ){
            engageIsWorks = false;
            return engageIsWorks;
        }
        public boolean checkEngage ( ){
            return engageIsWorks;
        }

        public int getHP() {
            return HP;
        }

        public void setHP(int HP){
            this.HP = HP;
        }

    }
    public Engage getEngage(){
        return this.engage;
    }

    public boolean checkSwim(){
        return this.engage.checkEngage();
    }

    public boolean boatIsRunning(){
        boolean result = this.engage.engageOn();
        return result;
    }
    public boolean boatIsStopped(){
        boolean result = this.engage.engageOff();
        return result;
    }
}
