// Order 3

package basic;

public class c03_DataTypes {
    public static void main(String[] args) {
        // Tipos de datos primitivos 

        int number = 23;           // N° entero
        double decimal = 34.5;     // N° decimal Doblemente precisio
        float decimalPI = 3.1416f; // N° decimal menos preciso
        char carcter = 'l';        // Unico caracter (comillas simples)
        boolean myBoolean = true;  // verdadero o falso

        System.out.println(myBoolean);

        // Tipos de datos como clase

        String name = "LeoDev";        // texto
        Boolean youBoolean = false;    // booleano
        Double decimalClass = 24.5;    // decimal
        Integer entero = 23;           // entero
        Float flotante = 23.4f;          // float

        System.out.println(decimalClass);

        // Para saber el tipo de datos (si es un objeto)

        System.out.println(name.getClass().getSimpleName());
    }
}
