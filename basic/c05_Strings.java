// Order 5

package basic;

import java.util.Arrays;

public class c05_Strings {
    public static void main(String[] args){
        // ------- Contatenación -----------
        var name = "  LeoDev  ";
        var lastname = "Kriptom";
        var message = "Hola como estas LeoDev";

        System.out.println(name + " " + lastname);

        // -------- Funciones --------------

        name.length(); // Devulve la longitud de la cadena
        name.charAt(2); // Trae el caracter de ese indice
        name.substring(2);  // Devuelve el el texto  de esa posicion en adelante OJO substring(inicio, fin)
        name.indexOf("D"); // Trae el indice de ese caracter
        name.toLowerCase(); // Convierte a minuscula
        name.toUpperCase(); // Convierte a mayuscula
        name.contains("D"); // Comprobar si contiene

        name.equals("LeoDev"); // compara si es igual (true or false)
        name.equalsIgnoreCase("leodev");  // Compara si es igual ignora entre mayuscula o minuscula (true or false)

        name.trim(); // Elimina espacio al final y al inicio
        message.replace("LeoDev", "Kriptom");  // Reemplaza

        var list =  message.split(" "); // convierte a lista el texto
        System.out.println(Arrays.toString(list)); // Mostramos

        System.out.println(String.join(",  ", list));  // Convertiemo a texto la lista
        

        // ---------- Formateando texto ---------------
        var texto = "Kriptom";
        var age = 34;

        var format = String.format("Hola %s, tienes %d años cierto?", texto.trim(), age);
        System.out.println(format);

    }
}
