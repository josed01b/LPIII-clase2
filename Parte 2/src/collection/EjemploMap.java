package collection;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();  //si se quiere con orden seria con LinkedHashMap
        map.put(3, "AccionMostrar");
        map.put(4, "AccionEliminar");
        System.out.println(map);
        map.put(28, "AccionCualquiera");
        map.put(11, "AccionCualquiera2");  // si se coloca otro con el mismo indice pero diferente mensaje se sobre escribe
        System.out.println(map);

        String value28=map.get(28);
        System.out.println(value28);

        map.forEach((key, value) -> System.out.println("key: " + key + " -> " + "Value:" + value));
    }
}
