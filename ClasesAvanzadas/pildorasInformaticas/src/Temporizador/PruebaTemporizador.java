package Temporizador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {


        Date ahora = new Date();

        System.out.println("Te pongo la hora cada 5 sg: " + ahora);

        Toolkit.getDefaultToolkit().beep();

    }
}
