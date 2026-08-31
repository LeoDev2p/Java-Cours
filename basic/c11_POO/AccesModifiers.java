package basic.c11_POO;
// en clases no se peude usar otros modificadores solo public

public class AccesModifiers {
    /*
    >> public: El método se puede usar desde cualquier clase del proyecto.
    >> private: El método solo se puede usar dentro de la misma clase donde se creó (ideal para ocultar lógica interna).
    >> protected: Se puede usar en la misma clase, en el mismo paquete y en clases hijas (herencia).
    >> Sin modificar (Default): Si no escribes nada, solo se puede usar dentro de las clases del mismo paquete.
    */

    protected String name;
    private String cod;
    private Boolean registered;

    public AccesModifiers(String name, String cod) {
        this.name = name;
        this.cod = cod;
        registered = true;
    }

    public void studentRegistered(){
        System.out.printf("%nEstudiante registrado %nNombre : %s%nCodigo: %s", name, cod);
        return;
    }

    // getters -> La forma mas recomendabda de leer datos privados
    public Boolean getRegistered(){
        return registered;
    }

    public String getCode(){
        return cod;
    }

    // setters -> La forma mas recomendada de actualizar datos privados o protegidos
    public void setCode(String cod){
        // this.cod = cod;
        if (!(cod.strip().startsWith("-"))){
            this.cod = cod;
        } else {
            System.out.println("Codigo incorrecto");
            return;
        }

        System.out.println("Codigo actualizado");
    }

}
