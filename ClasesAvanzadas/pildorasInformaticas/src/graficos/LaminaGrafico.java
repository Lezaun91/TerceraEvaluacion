package graficos;

import javax.swing.*;
import java.awt.*;

public class LaminaGrafico extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.drawString("Estamos aprendiendo Swing", 10,10);

    }

}
