package Ejercicio12;

import java.time.LocalDate;

public class Revista extends Publicacion{

    private int numero;

    public Revista(int codigo, String titulo, LocalDate fechaPublicacion, int numero) {
        super(codigo, titulo, fechaPublicacion);
        this.numero=numero;
    }

    @Override
    public int getCodigo() {
        return 0;
    }

    @Override
    public LocalDate getFechaPublicacion() {
        return null;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
                '}';
    }

    @Override
    public String getTituto() {
        return null;
    }

}
