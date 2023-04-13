package publicaciones;

import java.time.LocalDate;

public class Noticias extends Publicacion{
    private String nombre;

    public Noticias(String texto, String encabezado, LocalDate fechaPublicacion, String nombre) {
        super(texto, encabezado, fechaPublicacion);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String dameTexto(){
        return getTexto() + nombre;
    }
    public String dameEncabezado(){
        return getEncabezado();
    }
    public LocalDate dameFechaPublicacion(){
        return getFechaPublicacion();
    }
}
