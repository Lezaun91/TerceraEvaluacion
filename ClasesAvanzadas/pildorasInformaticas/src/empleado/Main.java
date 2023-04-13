package empleado;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0]= new Empleado("Luis Conde", 50000,2009,02,21);
        lasPersonas[1]= new Alumno("Víctor", "Informatica");

        for (Persona tipos: lasPersonas) {
            System.out.println(tipos.dameNombre() + " " + tipos.dameDescripcion());
        }


        Jefe jefeRRHH = new Jefe("Víctor", 37500,1991,10,5);

        jefeRRHH.estableceIncentivo(2500);

        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado("Antonio", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("jorge", 25000, 1992, 11, 27);
        misEmpleados[2] = new Empleado("paco", 33000, 1999, 07, 27);
        misEmpleados[3] = new Empleado("yoyo", 33000, 1999, 07, 27);
        misEmpleados[4] = jefeRRHH;
        misEmpleados[5] = new Jefe("caste", 95000, 1999, 07, 27);

        Jefe jefaFinanzas = (Jefe) misEmpleados[5];

        System.out.println(jefaFinanzas.tomarDecisiones("Subir el sueldo"));

        jefaFinanzas.estableceIncentivo(55000);

        System.out.println("el jefe " + jefaFinanzas.dameNombre() + " tiene un bonus de: " + jefaFinanzas.estableceBonus(500));
        System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(600));


        for (Empleado aumentarSueldo: misEmpleados) {
            aumentarSueldo.subirSueldo(5);
        }

        Arrays.sort(misEmpleados);


        for (Empleado imprimeNuevo:misEmpleados) {
            System.out.println("Nombre: " + imprimeNuevo.dameNombre() +
                    " sueldo: " + imprimeNuevo.dameSueldo() +
                    " Fecha de Alta: " + imprimeNuevo.dameFechaContrato());

        }
    }
}
