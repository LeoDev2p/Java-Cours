package basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class c07_Arrays {
    public static void main(String[] args) {
        // ----------- Arrays ----------------

        // Creamos el array con la cantidad maxima a almacenar y vacia
        var names = new String[5];
        System.out.println(names[2]);

        // Creamos el array con cantidad no definida a almacenar pero instanciada
        String[] names2 = {"Cesar", "Abigail", "Brenda", "Kristhell"};

        System.out.println(names2[2]);

        // Creamos el array con datos 
        var lista = new String[]{"hola", "como", "estas"};
        System.out.println(lista[0]);

        lista[1] = "ejemplo";
        System.out.println(lista[1]);

        // ------------- Arrays List ---------------


        var list = new ArrayList<String>(); // Creamos vacio

        // Agregamos datos a la Lista
        list.add(0, "Cesar"); // posicion especifica
        list.addFirst("Brenda"); // Agrega al incio
        list.addLast("Kristhell"); // Agrega al final

        System.out.println(list.size()); // Tamaño de elementos

        // obtenemos datos
        System.out.println(list.get(2)); // posicion especifica
        System.out.println(list.getFirst()); // del inicio
        System.out.println(list.getLast()); // del final

        System.out.println(list.subList(1, 3)); // Mostramos partes del  ArrayList

        // modificamos un dato de una posicion
        list.set(2, "LeoDev");
        System.out.println(list.getLast());

        // eliminar datos
        list.remove("LeoDev"); // indice o palabra
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);


        // buscamos si existe un elemento IN
        System.out.println(list.contains("Brenda"));

        // Limpiamos todo el ArraysList
        list.clear();
        System.out.println(list.size());

        // Clonamos el ArrayList (caja diferente mismo contenido)
        var newList = list.clone();
        System.out.println(newList);

        // invertir orden
        System.out.println(list.reversed());

        // Ordenar  y revertir
        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());

        // ---------------- Lista inmutable (tupla) -----------

        var tupla = List.of(1, 2, 3,6, 6, 7, 9);
        System.out.println(tupla);

    }
}
