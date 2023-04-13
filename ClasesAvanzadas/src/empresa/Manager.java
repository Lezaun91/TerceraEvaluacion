package empresa;

import java.time.LocalDate;
import java.util.Date;

public class Manager extends Empleado{
    private boolean sonrisa;

    public Manager(int añoNacimiento, String direccion, String nombre, LocalDate fechaInicio, double salario, String id, boolean sonrisa) {
        super(añoNacimiento, direccion, nombre, fechaInicio, salario, id);
        this.sonrisa = sonrisa;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;

    }


    @Override
    public String toString() {

        String cadena= " ";

        cadena = getNombre() + " nacio el " + getAñoNacimiento() +
                " y vive en la calle " + getDireccion() + " Me contrataron el dia " + getFechaInicio() + " " +
                "y cobro al año " + getSalario() + " y estoy " + imprimirFeliz();
        return cadena;
    }
    public String imprimirFeliz(){
        String carita = "";
        if (sonrisa==true){
            carita = ":)";
        } else {
            System.out.println(":(");
        }
        return carita;
    }
    public void ImprimirDatosPersonales(){
        System.out.println(toString());
    }
    public void subirSalario(){
        double porcentaje= 0.02;
        double nuevoSalario = this.getSalario() + this.getSalario() * porcentaje;
        this.setSalario(nuevoSalario);
        }

}
