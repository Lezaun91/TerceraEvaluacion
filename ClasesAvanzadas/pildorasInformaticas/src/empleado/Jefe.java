package empleado;

public class Jefe extends Empleado implements Jefes{

    private double incentivo;

    public Jefe(String nom, double sue, int anyo, int mes, int dia) {
        super(nom, sue, anyo, mes, dia);
    }

    public void estableceIncentivo(double incentivoSubida){
        incentivo =incentivoSubida;
    }
    public double dameSueldo(){
        double sueldoJefe = super.dameSueldo();

        return sueldoJefe + incentivo;
    }

    @Override
    public String tomarDecisiones(String decision) {
        return "Un miembro de la direccion ha tomado la decision de: " + decision;
    }

    @Override
    public double estableceBonus(double gratificacion) {
        double prima=2000;//por ser jefe

        return Trabajador.bonus_base + gratificacion + prima;
    }
}
