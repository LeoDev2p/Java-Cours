package basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class c09_loops {
    public static void main(String[] args) {
        // ----------- Bucle for ----------------
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

        // -------- Bucle while -----------
        // bucle while (condicion) {} 

        var contador = 0;

        while (contador < 5) {
            contador++;
            System.out.println("Bucle");
        }
        
        while (contador < nombres.length) {
            System.out.println(nombres[contador]);

        }

        // Bucle do-while ()

        var cont = 0;

        do {
            System.out.println("Minimo una ejecucion");
            cont++;
        } while (cont < 2);

        var post = true;
        var scanner = new Scanner(System.in);

        do {
            System.out.println("Minimo una ejecucion");

            System.out.print("Message: ");
            var input = scanner.next();
            if (input.toLowerCase().equals("exit")) {
                post = false;
            }
            
        } while (post);

        // OJO: tambien usar continue y break

        var contador1 = 0;

        do {
            contador1++;
            if (contador1 == 5) {
                // obvia lo resto y continua
                continue;
            } else if (contador1 == 7) {
                // rompemos el bucle si entra aqui
                break;
            }
        } while (false);

    }
    
}
