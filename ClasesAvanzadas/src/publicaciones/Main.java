package publicaciones;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Noticias noticiaUcrania = new Noticias("La seccion de estas noticias son internacionales y pertenecen al periodico "
                ,"GUERRA EN UCRANIA", LocalDate.of(2019,12,23),"El Pais");

        StringBuilder noticia = new StringBuilder();
        noticia.append(noticiaUcrania.dameEncabezado());
        noticia.append("\n");
        noticia.append(noticiaUcrania.dameTexto());
        noticia.append("\n");
        noticia.append("Publicado el: " + noticiaUcrania.dameFechaPublicacion());
        System.out.println(noticia);

        Articulo videojuegos = new Articulo("La seccion de este Articulo se centra en los videojuegos y esta escrita por "
                , "PLAYSTATION VS X-BOX",LocalDate.of(2020,11,19));

        videojuegos.setAutor("Roberto");

        StringBuilder articulo = new StringBuilder();
        articulo.append("-----------------------------------------------------------------------------------");
        articulo.append("\n");
        articulo.append(videojuegos.dameEncabezado());
        articulo.append("\n");
        articulo.append(videojuegos.dameTexto());
        articulo.append("\n");
        articulo.append("Publicado el: " + videojuegos.dameFechaPublicacion());
        System.out.println(articulo);

        Anuncio anuncioCoche = new Anuncio("Si vienes ahora podras ahorrar hasta un 20%, solo hasta el ", "OFERTA COCHE SEAT"
                ,LocalDate.of(2023,02,17),LocalDate.of(2023,05,10));


        StringBuilder anuncio = new StringBuilder();
        anuncio.append("-----------------------------------------------------------------------------------");
        anuncio.append("\n");
        anuncio.append(anuncioCoche.dameEncabezado());
        anuncio.append("\n");
        anuncio.append((anuncioCoche.dameTexto()));
        anuncio.append("\n");
        anuncio.append("Publicado el: " + anuncioCoche.dameFechaPublicacion());
        System.out.println(anuncio);



    }
}
