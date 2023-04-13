package reinoAnimal;

import java.util.ArrayList;

public abstract class Mamiferos {
    private ArrayList<Mamiferos> mamiferos;

    public Mamiferos() {
        this.mamiferos = new ArrayList<>();
    }


    public String saludar(){
        return"grr";
    }
    public final void saludoSecretamente(){

    }

    public ArrayList<Mamiferos> getMamiferos() {
        return mamiferos;
    }

    public void añadirMamiferos(Mamiferos mamife) {
        mamiferos.add(mamife);
    }
    public void añadirMamiferos2(Mamiferos mamife, Mamiferos m) {
        mamiferos.add(mamife);
        mamiferos.add(m);
    }

    public void saludarTodos(){
        for(Mamiferos animales : mamiferos ){
            animales.saludar();
        }
    }
}
