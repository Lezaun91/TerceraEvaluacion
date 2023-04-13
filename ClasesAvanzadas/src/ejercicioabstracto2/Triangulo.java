package ejercicioabstracto2;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangulo extends Figura2D {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        super(3);
        this.punto1=punto1;
        this.punto2=punto2;
        this.punto3=punto3;
    }

    public Triangulo(ArrayList<Punto> puntosTriangulo) {
        super(3);
        this.punto1=puntosTriangulo.get(0);
        this.punto2=puntosTriangulo.get(1);
        this.punto3=puntosTriangulo.get(2);



    }

    @Override
    protected ArrayList<Linea> crearLineas() {
        ArrayList<Linea> geometria = new ArrayList<>();


        Linea linea1 = new Linea(punto1, punto2);
        geometria.add(linea1);

        Linea linea2 = new Linea(punto2, punto3);
        geometria.add(linea2);

        Linea linea3 = new Linea(punto3, punto1);
        geometria.add(linea3);


        return geometria;
    }

    @Override
    public double calcularPerimetro() {


        return a() + devolverLadoBase() + c();
    }

    @Override
    public double calcularArea() {

        return (c() * devolverLadoBase())/2;
    }

    public double devolverLadoBase() {
        ArrayList<Linea> lineas = crearLineas();
        return lineas.get(0).calcularLongitud();

        }

        public double a () {
            ArrayList<Linea> lineas = crearLineas();
            return lineas.get(1).calcularLongitud();
        }
    public double c() {
        ArrayList<Linea> lineas = crearLineas();
        return lineas.get(2).calcularLongitud();
    }
    }



