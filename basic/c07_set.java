package basic;

import java.util.HashSet;
import java.util.Set;

public class c07_set {
    public static void main(String[] args) {
        /* Mutbale y no tiene index */
        // ------ Creamos un set vacio ------------
        var myset = new HashSet<String>();

        myset.add("LeoDev"); // Agregamos datos al set
        myset.add("Kriptom"); 

        myset.contains("LeoDev"); // checamos si existe en el set

        var newset = myset.clone(); // clonamos el contenido

        myset.remove("LeoDev"); // Elimina por dato
        myset.clear(); // LImpiamos todo el set
        myset.size(); // Devuelve el tamaño del set
        myset.isEmpty(); // Comprueba si esta vacio

        // ----------- Funciones de conjuntos (creamos set con datos) --------------
        
        var set = new HashSet<String>(Set.of("Isaias", "Kriptom", "LeoDev", "LeoDev@gmail.com"));

        var set2 = new HashSet<String>(Set.of("Peru", "Chile", "Ecuador", "Colombia", "LeoDev"));

        set.addAll(set2);  // Union (O) dos sets
        System.out.println(set);

        set.retainAll(set2); // Interseccion (Y) dos sets
        System.out.println(set);

        set.removeAll(set2); // Diferencia (-) dos sets
        System.out.println(set);


        // ------------ set inmutable -------------------

        var setInmutable = Set.of("primero", "segundo", "tercero");
        System.out.println(setInmutable);

        // setInmutable.add("algo")  -> Error

    }
}
