package batalladelasalmas;

import java.util.ArrayList;

public class Humano extends Ser implements Espiritual{
    private double fe;
    ArrayList<Demonio> demonio;
    ArrayList<Angel> angel;

    public Humano(double fe){
        this.fe=fe;
    this.angel=new ArrayList<>();
    this.demonio= new ArrayList<>();

    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }
    public void Rezar(){
        añadirAngel();
        fe++;

    }
    public void Pecar(){
        añadirDemonio();
        fe--;
    }
    public void añadirAngel(){
        Angel angel1 = new Angel((int)(Math.random()*100 + 1));
        angel.add(angel1);

    }
    public void añadirDemonio(){
        Demonio demonio1 = new Demonio((int)(Math.random()*100 + 1));
    }

    @Override
    public void mostar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Datos del Humano:  " + "\n================" + "\nFe: " + fe + "\nLos demonios del humano son "
                + demonio + "\nLos angeles del humano son " + angel;
    }
}
