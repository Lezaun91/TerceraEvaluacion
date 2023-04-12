package graficos;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;

public class MarcoCentrado extends JFrame {
    public MarcoCentrado(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        Dimension tamanoPantalla = miPantalla.getScreenSize();

        int alturaPantalla= tamanoPantalla.height;

        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla/2,alturaPantalla/2);

        setLocation(anchoPantalla/4, alturaPantalla/4);

        setTitle("Marco Centrado");

        Image miIcono = miPantalla.getImage("woody-allen.gif");

        setIconImage(miIcono);
    }
}
