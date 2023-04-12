package ejercicio11;

public class Ejercicio11 implements Relaciones{
    private int numero;
    public Ejercicio11(int numero){
        this.numero = numero;

    }


    @Override
    public boolean esMayor(Object b) {
        if (b instanceof Integer) {
            if (this.numero > (int) b) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean esMenor(int b) {
        if (this.numero<b){
            return true;
        }
        return false;
    }

    @Override
    public boolean esIgual(int b) {
        if (this.numero==b){
            return true;
        }
        return false;
    }
}
