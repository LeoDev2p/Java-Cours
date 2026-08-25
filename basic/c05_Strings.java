// Order 5

package basic;

import java.util.Arrays;
import java.util.Scanner;

public class c05_Strings {
    public static void main(String[] args){
        // ------- Contatenación -----------
        var name = "  LeoDevo  ";
        var lastname = "Kriptom";
        var message = "Hola como estas LeoDev";

        System.out.println(name + " " + lastname);

        // -------- Funciones --------------

        name.length(); // Devulve la longitud de la cadena
        name.charAt(2); // Trae el caracter de ese indice
        name.concat("texto");  // concatena
        name.toLowerCase(); // Convierte a minuscula
        name.toUpperCase(); // Convierte a mayuscula
        name.endsWith("ev");  // Comprueba si termina en
        name.startsWith("L"); // Comprueba si empieza con
        name.isEmpty();  // Comprueba si esta vacio
        name.isBlank();  // Comprueba si esta vacio o solo tiene espacios

        name.substring(2);  // Devuelve el el texto  de esa posicion en adelante OJO substring(inicio, fin)

        name.indexOf("o"); // Trae el indice de ese caracter (derecha a izquierda)
        message.indexOf("texto", 2, 6);
        message.lastIndexOf("o"); // Trae el indice de ese caracter (izquierda a derecha)
        name.contains("D"); // Comprobar si contiene

        name.equals("LeoDev"); // compara si es igual (true or false)
        name.equalsIgnoreCase("leodev");  // Compara si es igual ignora entre mayuscula o minuscula (true or false)

        name.strip(); // Elimina espacio al final y al inicio
        message.replace("LeoDev", "Kriptom");  // Reemplaza

        var list =  message.split(" "); // convierte a lista el texto
        System.out.println(Arrays.toString(list)); // Mostramos

        System.out.println(String.join(",  ", list));  // Convertiemo a texto la lista
        

        // ---------- Formateando texto ---------------
        var texto = "Kriptom";
        var age = 34;

        var format = String.format("Hola %s, tienes %d años cierto?", texto.trim(), age);
        System.out.println(format);

        // ------------ Entrada de texto por consola -------

        var input = new Scanner(System.in);

        System.out.print("Ingrese sun nombre: ");
        var nombre = input.nextLine();

        System.out.printf("Su nombre es %s", nombre);


    }
}
