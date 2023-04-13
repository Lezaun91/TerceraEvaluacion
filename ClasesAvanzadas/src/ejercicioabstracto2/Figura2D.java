package ejercicioabstracto2;

import java.util.ArrayList;

public abstract class Figura2D {

     int lados;

    private final int DIMENSIONES ;
    public Figura2D(int lados){
        this.DIMENSIONES=2;
        this.lados=lados;



    }
    public String nombreFigura(){
        String cadena= "";
        if (lados==3){
            cadena= "Triangulo";
        } else if (lados==4) {
            cadena= "Rectangulo";

        }
        else {
            System.out.println("No corresponde a ninguna figura");
    }
        return cadena;
    }
    protected abstract ArrayList<Linea> crearLineas();
    public abstract double calcularPerimetro();
    public abstract double calcularArea();
}
