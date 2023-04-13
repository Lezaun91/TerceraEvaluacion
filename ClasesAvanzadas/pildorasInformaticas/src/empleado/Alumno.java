package empleado;

public class Alumno extends Persona{

    private String carrera;

    public Alumno(String nombre, String carrera){
        super(nombre);
        this.carrera= carrera;
    }

    @Override
    public String dameDescripcion() {
        return "Este alumno esta estudiando la carrera de " + carrera;
    }
}
