package ejercicioabstracto2;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangulo extends Figura2D {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;


    public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(4);
        this.punto1=punto1;
        this.punto2=punto2;
        this.punto3=punto3;
        this.punto4=punto4;


    }

    public Rectangulo(ArrayList<Punto> puntosRectangulo) {

        super(4);

    }

    @Override
    public ArrayList<Linea> crearLineas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Punto de inicio");
        Punto puntoInicio = new Punto(sc.nextInt(), sc.nextInt());
        System.out.println("Punto Final");
        Punto puntoFinal = new Punto(sc.nextInt(), sc.nextInt());
        Linea linea1 = new Linea(puntoInicio, puntoFinal);
        ArrayList<Linea> geometria = new ArrayList<>();
        geometria.add(linea1);
        System.out.println(geometria);
        return geometria;
    }

    @Override
    public double calcularPerimetro() {

        double perimetro = this.devolverLadoAltura()*2 + this.devolverLadoBase()*2;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double areaRectangulo = devolverLadoBase() * devolverLadoAltura();
        return areaRectangulo;
    }

    public double devolverLadoBase() {
        double ladoBase;
        if (punto1.getX() > punto2.getX()) {
            ladoBase = punto1.getX() - punto2.getX();
        } else if (punto1.getX() > punto3.getX()) {
            ladoBase = punto1.getX() - punto3.getX();
        } else if (punto1.getX() > punto4.getX()) {
            ladoBase = punto1.getX() - punto4.getX();
        } else if (punto2.getX() > punto1.getX()) {
            ladoBase = punto2.getX() - punto1.getX();
        } else if (punto2.getX() > punto3.getX()) {
            ladoBase = punto2.getX() - punto3.getX();
        } else if (punto2.getX() > punto4.getX()) {
            ladoBase = punto2.getX() - punto4.getX();
        } else if (punto3.getX() > punto1.getX()) {
            ladoBase = punto3.getX() - punto1.getX();
        } else if (punto3.getX() > punto2.getX()) {
            ladoBase = punto3.getX() - punto2.getX();
        } else if (punto3.getX() > punto4.getX()) {
            ladoBase = punto3.getX() - punto4.getX();
        } else if (punto4.getX() > punto1.getX()) {
            ladoBase = punto4.getX() - punto1.getX();
        } else if (punto4.getX() > punto2.getX()) {
            ladoBase = punto4.getX() - punto2.getX();
        } else {
            ladoBase = punto4.getX() - punto3.getX();
        }

        return ladoBase;
    }

    public double devolverLadoAltura() {
        double ladoAltura;
        if (punto1.getY() > punto2.getY()) {
            ladoAltura = punto1.getY() - punto2.getY();
        } else if (punto1.getY() > punto3.getY()) {
            ladoAltura = punto1.getY() - punto3.getY();
        } else if (punto1.getY() > punto4.getY()) {
            ladoAltura = punto1.getY() - punto4.getY();
        } else if (punto2.getY() > punto1.getY()) {
            ladoAltura = punto2.getY() - punto1.getY();
        } else if (punto2.getY() > punto3.getY()) {
            ladoAltura = punto2.getY() - punto3.getY();
        } else if (punto2.getY() > punto4.getY()) {
            ladoAltura = punto2.getY() - punto4.getY();
        } else if (punto3.getY() > punto1.getY()) {
            ladoAltura = punto3.getY() - punto1.getY();
        } else if (punto3.getY() > punto2.getY()) {
            ladoAltura = punto3.getY() - punto2.getY();
        } else if (punto3.getY() > punto4.getY()) {
            ladoAltura = punto3.getY() - punto4.getY();
        } else if (punto4.getY() > punto1.getY()) {
            ladoAltura = punto4.getY() - punto1.getY();
        } else if (punto4.getY() > punto2.getY()) {
            ladoAltura = punto4.getY() - punto2.getY();
        } else {
            ladoAltura = punto4.getY() - punto3.getY();
        }

        return ladoAltura;
    }
}
