package Temporizador2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Reloj {



    public void enMarcha(int intervalo, final boolean sonido){

        class Temporizador2 implements ActionListener{

            public void actionPerformed(ActionEvent evento){

                Date ahora = new Date();

                System.out.println("te pongo la hora cada 3 sg " + ahora);

                if (sonido){
                    Toolkit.getDefaultToolkit().beep();
                }

            }
        }

        ActionListener oyente = new Temporizador2();

        Timer miTemporizador = new Timer(intervalo, oyente);

        miTemporizador.start();


    }



}
