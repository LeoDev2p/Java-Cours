// Order 1

package basic;

public class c01_VariablesConstant {
    public static void main(String[] args) {

        // Asignación de variables
        String name = "Isaias Cesar";
        int age = 25;
        var mivariable = "LeoDev"; // autodetectable tipo

        System.out.printf("Name: %s, %nAge: %d", name, age);
        System.out.println(mivariable);

        // Constantes (para definir usa la palabra reservada final)

        final String EMAIL = "whoamy0608@gmail.com";
        System.out.println(EMAIL);

    }
}
