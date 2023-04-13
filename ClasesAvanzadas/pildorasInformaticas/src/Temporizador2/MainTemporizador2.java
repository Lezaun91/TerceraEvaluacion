package Temporizador2;

import javax.swing.*;

public class MainTemporizador2 {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();

        miReloj.enMarcha(1000,true);

        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para terminar");

        System.exit(0);

    }

}
