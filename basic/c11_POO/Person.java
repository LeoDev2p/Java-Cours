package basic.c11_POO;

// En java un archivo es una clases, por lo que una clases debe tener su propio archivo.java

public class Person {
    // Los atributos siempre se definen en la clase

    boolean status;
    String name;
    int age;

    // Creamos el constructor con el mismo nombre de la clase
    public Person(String name, int age){
        this.name = name;   // solo si la variable tiene el mismo nombre del paramero usar this
        this.age = age;
    }

    // Creamos metodos
    public void saludo(){
        System.out.printf("Hola soy %s y tengo %d años %n", name, age);
    }
}
