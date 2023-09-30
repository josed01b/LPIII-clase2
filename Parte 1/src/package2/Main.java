package src.package2;
import src.singleton.Singleton;
import src.builder.Empleado;

public class Main {

    public static void main(String[] args){

        /*Singleton singleton = Singleton.getInstance();
         */

        Empleado empleado = Empleado.builder()
                        .id(123L)
                        .nombre("Jose")
                        .build();
        System.out.println(empleado);

    }
}
