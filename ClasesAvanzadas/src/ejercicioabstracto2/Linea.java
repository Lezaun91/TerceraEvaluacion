package ejercicioabstracto2;


import java.text.DecimalFormat;

public class Linea {

    private Punto puntoInicio;

    private Punto puntoFinal;

    private final int DIMENSION;

    public Linea(Punto puntoInicio, Punto puntoFinal){

        this.puntoInicio=puntoInicio;
        this.puntoFinal = puntoFinal;
        this.DIMENSION = 1;


    }
    public double calcularLongitud(){

            double distanciaX = Math.pow(puntoInicio.getX()- puntoFinal.getX(), 2);
            double distanciaY = Math.pow(puntoInicio.getY()- puntoFinal.getY(), 2);
            //double numeroRedondeado = Double.parseDouble(df.format(distanciaAux));

            return Math.sqrt(distanciaX + distanciaY);

    }
    public void dibujarLinea(){
        System.out.println(calcularLongitud());
    }

    @Override
    public String toString() {
        return "Linea{" +
                "puntoInicio=" + puntoInicio +
                ", puntoFinal=" + puntoFinal +
                ", DIMENSION=" + DIMENSION +
                '}';

    }
}
