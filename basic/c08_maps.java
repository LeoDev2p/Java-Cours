package basic;

import java.util.HashMap;

public class c08_maps {
    public static void main(String[] args) {
        // ------- creamos un map (diccionario) ----------
        var map = new HashMap<String, String>();

        System.out.println(map.size()); // Obtenemos el tamaño

        // put (key, value): permite crear o agregar un nuevo valor
        map.put("LeoDev", "leodev@gmail.com"); 
        map.put("Kriptom", "Kriptom@gmail.com");
        map.put("Atlas", "Atlas@gmail.com");

        // Obtenemos datos 
        map.get("Kriptom");  // Devuelve el valor de al clave
        map.values(); // Devuelve lista  de claves
        map.keySet(); // Devuelve lista de valores
        map.entrySet(); // Devuelve lista de pares (clave, valor)

        // Elimina ro limpiar
        map.remove("Kriptom");  // Eliminamos el par y devuelve su valor
        map.clear();  // Limpiamos todo el mapa
        
        // comprobación si existe una clave o valor en el mapa
        map.containsKey("Kriptom");  // comprobamos si existe la clave
        map.containsValue("Kriptom@gmail.com");  // comprobamos si existe el valor
        map.isEmpty();  // Comprueba si esta vacio o no

        // Otras funciones
        map.replace("Kriptom", "Prueba@gmail.com"); // Actulizar una clave
        map.size();  // Longitud del mapa
        map.clone(); // Clona el contenido del mapa
        map.clear();  // Elimina o limpia el mapa

       



    }
    
}
