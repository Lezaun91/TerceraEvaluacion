package batalladelasalmas;

public class Angel extends Incorporeo{
    int bondad;
    int maldad;

    public Angel(int bondad){
        this.bondad=bondad;
        this.maldad=0;

    }

    @Override
    public void mostar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Este Angel tiene bondad " + bondad;
    }
}
