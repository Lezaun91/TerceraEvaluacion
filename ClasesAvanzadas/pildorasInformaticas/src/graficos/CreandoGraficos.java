package graficos;
import javax.swing.*;
import java.awt.*;
public class CreandoGraficos extends JFrame {
    public CreandoGraficos(){

        setVisible(true);

        setSize(600,450);

        setLocation(400,200);

        setTitle("Primer Texto");

        LaminaGrafico miLamina = new LaminaGrafico();

        add(miLamina);

    }
}
