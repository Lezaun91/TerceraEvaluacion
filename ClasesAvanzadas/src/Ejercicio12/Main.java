package Ejercicio12;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros= new ArrayList<>();
        Libro libro1= new Libro(1,"Harry potter 1", LocalDate.of(1997,05,23));
        Libro libro2= new Libro(2,"Harry potter 2", LocalDate.of(1998,05,23));
        Libro libro3= new Libro(3,"Harry potter 3", LocalDate.of(1999,05,23));
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        System.out.println(libros);
    }
    public static int cuentaPrestados(ArrayList<Libro> libros){
        int contadorLibrosPrestado = 0;
        for (Libro libroPrestado: libros) {
            if (libroPrestado.isPrestado()){
                contadorLibrosPrestado++;
                return contadorLibrosPrestado;
            }
        }
        return contadorLibrosPrestado;
    }
    public static int publicacionesAnterioresA(ArrayList<Publicacion> publicacionesAnteriores, LocalDate year){
        int contadorPublicacionesAnteriores = 0;
        for (Publicacion publicacionesInferiores: publicacionesAnteriores) {

        }
        return 0;
    }
}
