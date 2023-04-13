package publicaciones;

import java.time.LocalDate;

public class Anuncio extends Publicacion{
    private LocalDate fechaCaducidad;

    public Anuncio(String texto, String encabezado, LocalDate fechaPublicacion, LocalDate fechaCaducidad) {
        super(texto, encabezado, fechaPublicacion);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public String dameTexto(){
        return  getTexto()+ getFechaCaducidad() ;
    }
    public String dameEncabezado(){
        return getEncabezado();
    }
    public LocalDate dameFechaPublicacion(){
        return getFechaPublicacion();
    }
}
