package graficos;

import javax.swing.*;

public class PruebaDibujo extends JFrame {
    public PruebaDibujo(){

        setVisible(true);
        setBounds(450,300,600,250);
        setTitle("Prueba de Dibujo");
        LaminaDibujos miLamina = new LaminaDibujos();
        add(miLamina);


    }
}
