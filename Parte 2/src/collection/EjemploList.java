package collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploList {

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("Hola");
        strings.add("Caravana");
        //System.out.println(strings);

        strings.add("La buena");
        //System.out.println(strings);

        strings.remove("   La buena   ".trim());  //trim() elimina los espacios
        //System.out.println(strings);

        strings.remove(0);
        //System.out.println(strings);

        strings.addAll(List.of("Saludo","Despedida"));
        //System.out.println(strings);

        strings.add(2, "entrometido");
        //System.out.println(strings);

        //como recorrer una lista

        System.out.println("Enhanced for");
        for (String string: strings){
            System.out.println(string);
        }

        System.out.println("For each");
        strings.forEach(string -> System.out.println(string));
    }
}
