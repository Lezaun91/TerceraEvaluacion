package sobreCarga;

public class SubClase extends SuperClase{

    @Override
    public void metodo(){
        System.out.println("Caracolaaaaaa");
    }
    public void metodo(String s){
        System.out.println("Sobrecargado" + s);
    }
}
