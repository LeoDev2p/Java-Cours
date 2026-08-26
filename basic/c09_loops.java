package basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class c09_loops {
    public static void main(String[] args) {
        // bucle -> for (inicialización; condición; incremento) {}

        for (int i = 0; i <= 5; i++) {
            System.out.println("Hola LeoDev ..");
        }

        var nombres = new String[]{"Isaias", "Cesar", "LeoDev", "Brenda", "Kriptom", "Maria"};

        for (int i = 0; i < nombres.length; i++){
            System.out.printf("Nombre: %s%n", nombres[i]);
        }

        // bucle for-each (variable: coleccion) {}

        var set = new HashSet<String>();

        for (String name : nombres) {
            set.add(name);
        }

        System.out.println(set);

        var names = new HashMap<String, String>(Map.of("name", "LeoDev", "cel", "987654321", "country", "peru", "age", "24"));

        for (Map.Entry<String, String> datos: names.entrySet()) {
            System.out.println(datos);
            System.out.println(datos.getValue());
            System.out.println(datos.getKey());
        }
    }
    
}
