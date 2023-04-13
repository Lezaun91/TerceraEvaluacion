package empresa;



import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager(1991,"ejej","Victor",
                LocalDate.now(),57000, "8",true);


        Programador programador = new Programador(1991, "jeje", "Victor",
                LocalDate.now(),87000, "7",new String[]{"Java", "JavaScript"}, NivelProgramador.JUNIOR);
       // programador.ImprimirDatosPersonales();

       manager.subirSalario();
        System.out.println(manager);

        programador.subirSalario();
        System.out.println(programador);

        Programador programador1 = new Programador(1991, "jeje", "Victor",
                LocalDate.now(),157000,"10", new String[]{"Java", "JavaScript"}, NivelProgramador.SENIOR);

        Cliente cliente = new Cliente(1991,"jujuju","Yeahh", "7",true);

        /*Persona persona= new Persona(1991,"jijiji","muajjja", "5");

        Persona persona1= new Persona(1995,"ankaa", "Victor", "5");

        persona.equals(persona1);
        System.out.println(persona.equals(persona1));

        System.out.println(persona.getClass());

        /*programador.setLenguajes(new String[]{"Java"," javaScript", "C++"});// el set normal y aumento en uno

        //System.out.println(programador.getLenguajes().length);



        programador.setLenguajes(new String[]{"Java", "javaScript", "C++","Python","C"}, 3);

        //el set que tiene ademas el añadido de otro parametro

        Empleado empleado= new Empleado(1991,"ejje", "ankawa", LocalDate.now(),57000, "7");

       empleado.añadirProgramador(programador);
        empleado.añadirProgramador(programador1);
        empleado.añadirProgramador(manager);

        //System.out.println(empleado.getTrabajadores());

        empleado.imprimirTrabajadores();

        programador.añadirLenguaje("Java",3);

        //System.out.println(programador);


*/










    }
}
