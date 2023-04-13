package empresa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Programador extends Empleado{

    private String[] lenguajes;

    private NivelProgramador nivelProgramador;


    public Programador(int añoNacimiento, String direccion, String nombre, LocalDate fechaInicio, double salario, String id, String[] lenguajes, NivelProgramador nivelProgramador) {
        super(añoNacimiento, direccion, nombre, fechaInicio, salario, id);
        this.lenguajes = lenguajes;
        this.nivelProgramador = nivelProgramador;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
   public void setLenguajes(String[] lenguajes, int añosExperiencia){
        if (añosExperiencia>2){
            this.lenguajes= lenguajes;
        }
    }
    @Override
    public String toString() {
        String cadena = "";
        cadena = getNombre() + " nacio el " + getAñoNacimiento() +
                " y vive en la calle " + getDireccion() + " Me contrataron el dia " + getFechaInicio() + " " +
                "y cobro al año " + getSalario() + " y domina estos lenguajes de programacion " + imprimirArray();
        return cadena;
    }
    public void imprimir(){
        //System.out.println(Arrays.toString());
    }
    public String imprimirArray(){
        StringBuilder sb = new StringBuilder();
        for (String l : lenguajes){
            sb = sb.append(" " + l);
        }

        return sb.toString();
    }
    //2.Escribe un metodo que permita añadir un lenguaje al programador.
    public  void añadirLenguaje(String lenguaje){
        String[]nuevoArray = new String[lenguajes.length + 1];

        for (int i = 0; i < lenguajes.length; i++) {
            nuevoArray[i] = lenguajes[i];

        }
        nuevoArray[nuevoArray.length - 1] = lenguaje;



        lenguajes = nuevoArray.clone();
    }
    public  void añadirLenguaje(String lenguaje, int añoExperiencia){
        String[]nuevoArray = new String[lenguajes.length + 1];
        if (añoExperiencia>2) {
            añadirLenguaje(lenguaje);
          /*  for (int i = 0; i < lenguajes.length; i++) {
                nuevoArray[i] = lenguajes[i];

            }
            nuevoArray[nuevoArray.length - 1] = lenguaje;
            lenguajes = nuevoArray.clone();*/
        }else {
            System.out.println("No tienes suficiente experiencia");
            }
    }

    public NivelProgramador getNivelProgramador() {
        return nivelProgramador;
    }

    public void setNivelProgramador(NivelProgramador nivelProgramador) {
        this.nivelProgramador = nivelProgramador;
    }

    public void ImprimirDatosPersonales(){
        System.out.println(toString());
    }

    @Override
    public void subirSalario() {
        double porcentaje= 0;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("¿");*/
        double nuevoSalario = 0;
        if (nivelProgramador == NivelProgramador.JUNIOR){
            porcentaje = 0.01;
            nuevoSalario =getSalario() + getSalario() * porcentaje;
        } else if (nivelProgramador==NivelProgramador.SENIOR) {
            porcentaje = 0.015;
            nuevoSalario= getSalario() + getSalario() * porcentaje;
        } else {
            porcentaje=0.02;
            nuevoSalario=getSalario() + getSalario() * porcentaje;
        }

        this.setSalario(nuevoSalario);

    }
}
