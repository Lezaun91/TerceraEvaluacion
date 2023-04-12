package batalladelasalmas;

public class CampoDeBatalla {
    public CampoDeBatalla(){

    }

    public static void main(String[] args) {
        Humano humano1 = new Humano(21);
        humano1.añadirAngel();
        humano1.añadirAngel();
        humano1.añadirAngel();
        humano1.Rezar();

        System.out.println(humano1);
        luchar(humano1);



    }
    public static void luchar(Humano humano){
        int bondad=0;
        int maldad=0;
        for (Angel listado: humano.angel){
            bondad = listado.bondad + bondad;
        }
        System.out.println("Bondad de los Angeles: " + bondad);
        for (Demonio listado: humano.demonio){
            maldad= listado.getMaldad() + maldad;
        }
        System.out.println("Maldad de los demonios: " + maldad);
        System.out.println();
    }
}
