package empresa;

public class Cliente extends Persona{
    private boolean gold;

    public Cliente(int añoNacimiento, String direccion, String nombre, String id, boolean gold) {
        super(añoNacimiento, direccion, nombre, id);
        this.gold = gold;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }
   /* @Override
    public String toString() {
        String cadena= "";
        cadena = getNombre() + " nacio el " + getAñoNacimiento() +
                " y vive en la calle " + getDireccion() ;
        return cadena;
    }*/

    @Override
    public String toString() {
        return super.toString();
    }
    public void ImprimirDatosPersonales(){
        System.out.println(toString());
    }
}
