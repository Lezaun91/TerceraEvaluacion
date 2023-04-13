package Temporizador;

import javax.swing.*;

public class MainTemporizador {
    public static void main(String[] args) {

        PruebaTemporizador oyente = new PruebaTemporizador();

        Timer miTemporizador = new Timer(5000, oyente);

        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");

        System.exit(0);
    }


}
