package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class c10_Functions {
    public static void main(String[] args) {
        /* 
        OJO: No se peude llamar funciones que no sean static igual al main 

        OJO 2: sobrecarga de métodos -> permite crear funciones con el mismo nombre solo cambiando los parametros
        
        */

        for (var i = 0; i < 5; i++) {
            sendEmail();
        }

        var list_email = new ArrayList<String>(Arrays.asList("leodev@gmail.com", "whoamy@gmail.com", "prueba@gmail.com", "kriptom@gmail.com"));
        sendToEmail("LeoDev", list_email);

        var result = sendToEmailMe("leodev", list_email);
        System.out.println(result);   // true or false

    }

    // ----------- Funcion sin parametor ni retorno -------------
    public static void sendEmail(){
        System.out.println("Creando una funcion");
    }

    // ------- Funciones con parametros -------------------
    public static void sendToEmail(String name, ArrayList<String> list_email) {
        System.out.printf("Enviando a %s%n");
        for (var email: list_email) {
            System.out.println("Email " + email + "enviado");
        }
    }

    // ----------- Funciones con retorno ----------------

     public static boolean sendToEmailMe(String name, ArrayList<String> list_email) {
        if (list_email.isEmpty()) {
            return false;
        }
        System.out.printf("Enviando a %s%n");
        for (var email: list_email) {
            System.out.println("Email " + email + "enviado");
        }

        return true;
    }
}
