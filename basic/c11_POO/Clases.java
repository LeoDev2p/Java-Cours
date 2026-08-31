package basic.c11_POO;
import basic.c11_POO.Herencia.*;

/*
GUIA OFICIAL ORACLE / GOOGLE

>>> Clases ➔ PascalCase: Igual que Python, empiezan con mayúscula. (Ejemplo: Person, DatabaseConnection).
>>> Funciones (Métodos) ➔ camelCase: Empieza con minúscula, y las siguientes palabras con mayúscula. (Ejemplo: sendEmail(), calcularTotal()).
>>> Variables ➔ camelCase: Exactamente igual que los métodos. (Ejemplo: userName, userAge).
>>> Constantes ➔ UPPER_SNAKE_CASE: Igual que Python. (Ejemplo: MAX_VALUE)
*/

public class Clases {
    public static void main(String[] args){
        // ------- Clase -> Objeto  -> Instancia ------

        var persona = new Person("LeoDev", 25);
        persona.status = true;
        persona.saludo();

        var persona2 = new Person("Kriptom", 27);
        persona2.status = false;
        persona2.saludo();

        // -------------- Encapsulamiento -----------------

        var student = new AccesModifiers("LeDev", "987654321");
        student.studentRegistered();

        student.name = "Yolanda";
        student.studentRegistered();
        // System.out.println(student.registered); No se pupede por que es privado


        System.out.println(student.getRegistered());
        System.out.println(student.getCode());
        student.setCode("-11122334");

        // ------------- Herencia y Polimorfismo ----------

        var car = new Herencia.Carro(4, "Toyota", "Hilux", 2026);
        System.out.println(car.marca);
        car.mover();

        var avion = new Herencia.Avion("Sky", "JK808", 2025);
        System.out.println(avion.modelo);
        avion.mover();

        var barco = new Herencia.Barco(4, "Titanic", "T-800", 2027);
        System.out.println(barco.anclas);
        barco.mover();

        barco.explotar();
    }
    
}
