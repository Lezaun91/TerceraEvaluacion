package ejercicioabstracto2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* Punto punto1= new Punto(2,0);
        Punto punto2= new Punto(5,0);
        Punto punto3= new Punto(2,5);
        Punto punto4= new Punto(5,5);

        Rectangulo rectangulo1 = new Rectangulo(punto1,punto2,punto3,punto4);

        System.out.println("Perimetro del Rectangulo");
        System.out.println(rectangulo1.calcularPerimetro());
        System.out.println("Área del Rectangulo");
        System.out.println(rectangulo1.calcularArea());*/

        Punto punto5= new Punto(0,0);
        Punto punto6= new Punto(5,0);
        Punto punto7= new Punto(0,8);
        Triangulo triangulo = new Triangulo(punto5,punto6, punto7);

        System.out.println("Base del triangulo");
        System.out.println(triangulo.devolverLadoBase());
        System.out.println(triangulo.c());
        System.out.println(triangulo.a());
        System.out.println(triangulo.calcularPerimetro());
        System.out.println(triangulo.calcularArea());
        /*System.out.println("Altura del triangulo");
        System.out.println(triangulo.devolverA());
        System.out.println("Área del triangulo");
        System.out.println(triangulo.calcularArea());
        System.out.println("Perimetro del triangulo");
        System.out.println(triangulo.calcularPerimetro());
*/
      /*  System.out.println("Calculamos longitud de una linea");
        System.out.println("Punto del que partimos");
        Punto punto8 = new Punto(0,0);
        System.out.println("Punto al que lleguemos");
        Punto punto9 = new Punto(2,3);

        Linea linea1= new Linea(punto8,punto9);
        Linea linea2= new Linea(punto2,punto7);

        System.out.println(linea1.calcularLongitud());

        ArrayList<Linea> lineas = new ArrayList<>();
        lineas.add(linea1);
        lineas.add(linea2);
        System.out.println(lineas);
        lineas.remove(linea1);
        System.out.println(lineas);*/
    }
    public void menu(){

    }

    }



