package graficos;

import javax.swing.*;
import java.awt.*;

public class LaminaDibujos extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.drawRect(10,10,60,60);
        //g.drawLine(10,10,300,200);
        //g.drawArc(10,10,100,200,120,150);

    }
}
