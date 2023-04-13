package publicaciones;

import java.time.LocalDate;

public class Articulo extends Publicacion{
    private String autor;

    public Articulo(String texto, String encabezado, LocalDate fechaPublicacion) {
        super(texto, encabezado, fechaPublicacion);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String dameTexto(){
        return  getTexto() + getAutor();
    }
    public String dameEncabezado(){
        return getEncabezado();
    }
    public LocalDate dameFechaPublicacion(){
        return getFechaPublicacion();
    }
}
