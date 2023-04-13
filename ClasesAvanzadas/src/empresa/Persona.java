package empresa;

public abstract class Persona {


//1.Sobreescribe el metodo toString() en las subclases para que tenga un aspecto mas amigable.
    private int añoNacimiento;
    private String direccion;
    private String nombre;

    private String id;

    public Persona(int añoNacimiento, String direccion, String nombre, String id) {
        this.añoNacimiento = añoNacimiento;
        this.direccion = direccion;
        this.nombre = nombre;
        this.id= id;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return nombre + " nacio el " + añoNacimiento +
                " y vive en la calle " + direccion ;
    }

    @Override
    public boolean equals(Object obj) {
        Persona otraPersona = (Persona) obj;
        boolean iguales;
        if (this.id.equals(otraPersona.getId())){
            iguales = true;
        } else {
            iguales = false;
        }
        return super.equals(obj);
    }
    public abstract void ImprimirDatosPersonales();
}
