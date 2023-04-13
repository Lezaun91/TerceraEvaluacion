package empresa;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Empleado extends Persona{
    private LocalDate fechaInicio;
    private double salario;

    private ArrayList<Empleado> trabajadores;


    public Empleado(int añoNacimiento, String direccion, String nombre, LocalDate fechaInicio, double salario, String id) {
        super(añoNacimiento, direccion, nombre,id);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
        this.trabajadores= new ArrayList<>();
    }


    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = getNombre() + " nacio el " + getAñoNacimiento() +
                " y vive en la calle " + getDireccion() + " Me contrataron el dia " + getFechaInicio() + " " +
                "y cobro al año " + getSalario() + " €";
        return cadena;
    }
    public void añadirProgramador(Empleado empleado){
        trabajadores.add(empleado);
    }

    public ArrayList<Empleado> getTrabajadores() {
        return trabajadores;
    }
    public void imprimirTrabajadores(){
        for (Empleado e : trabajadores) {
            System.out.println(e + "\n");
        }
    }
    public abstract void ImprimirDatosPersonales();

    public abstract void subirSalario();

    //public void añadirProgramador(Manager manager){
        //trabajadores.add(manager);
    //}

}
