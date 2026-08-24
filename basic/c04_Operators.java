// Ordern 4

package basic;

public class c04_Operators {
    public static void main(String[] args) {

        var a = 10;
        var b = 2;

        // -------- Operador artimeticos ------------

        /*
        + : Suma
        - : Resta
        * : Multiplicación
        / : División
        % : Modulo
        */

        System.out.println(a + b);

        // ---------- Operadores de asignación ---------

        /*
        += :  asingar en suma
        -= :  asignar en resta
        *= :  asignar en multiplicación
        /= :  asignar en division
        %= :  asignar en modulo
        */

        a += 20;
        System.out.println(a);

        // -------- Operadores de comparación (relacionales) -------
        
        /*
        == : igual
        != : diferernte
        >  : mayor que
        >= : mayor o igual que
        <  : menor que
        <= : menor o igual que
        */

        System.out.println(a >= b);

        // ----------- Operadores logicos ------------

        // AND (Y) -> &&
        System.out.println(a > 2 && b < 1);

        // OR (O) -> ||
        System.out.println(a > 2 || b < 1);

        // NOT (NO)  -> !
        System.out.println(!(a > 2));

        // -------- Operadores Unarios ---------------

        var c = 4;

        System.out.println(-c); // convierte de a negativo
        System.out.println(+c); // convierte a posicito
        System.out.println(--c); // resta en 1
        System.out.println(++c); // suma en 2
        System.out.println(c--); // resta em 1 pero 
        System.out.println(c);   // Aqui recien se visualiza el cambio
        System.out.println(c++); // suma en 1 pero
        System.out.println(c);   // Aqui recien se visualiza el cambio

    }
}
