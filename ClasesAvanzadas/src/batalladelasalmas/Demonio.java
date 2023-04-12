package batalladelasalmas;

public class Demonio extends Incorporeo{
    private int bondad;
    private int maldad;

    public Demonio(int maldad){
        this.bondad= 0;
        this.maldad= maldad;
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    @Override
    public void mostar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Este demonio tiene maldad nivel " + maldad;
    }
}
