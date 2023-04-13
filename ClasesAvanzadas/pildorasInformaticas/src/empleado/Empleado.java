package empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona implements Comparable, Trabajador{
    public Empleado(String nom, double sue, int anyo, int mes, int dia){
        super(nom);

        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anyo,mes-1,dia);
        altaContrato = calendario.getTime();
    }


    public double dameSueldo(){//GETTER

        return sueldo;
    }
    public Date dameFechaContrato(){//GETTER

        return altaContrato;
    }

    public void subirSueldo(double porcentaje){//SETTER

        double aumento = sueldo * porcentaje/100;

        sueldo = sueldo + aumento;

    }
    public String dameDescripcion(){
        return "Este empleado tiene un sueldo = " + sueldo;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    @Override
    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;
        if (this.sueldo< otroEmpleado.sueldo){
            return -1;
        }
        if (this.sueldo> otroEmpleado.sueldo){
            return 1;
        }
        return 0;
    }

    @Override
    public double estableceBonus(double gratificacion) {
        return Trabajador.bonus_base + gratificacion;
    }
}

