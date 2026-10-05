package basic;

public class c06_Conditional {
    public static void main(String[] args){
        // Condiciones if, else if , else
        var age = 18;
        
        if (age == 18) {
            // bloque de code
            System.out.println("Acabas de cunplir 18");
        } else if (age > 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }


        // ---------- switch / case / default ---------------

        var day = 1;

        switch (day) {
            case 1, 3, 5, 7:
                System.out.println("Dia impar");
                break;
            
            case 2, 4, 6:
                System.out.println("Dia par");
                break;
        
            default: // Entra si ninguna de las anteriores cumple
                System.out.println("Dia no existe");
                break;
        }

        // switch con flecha ->

        var result = switch (Integer.valueOf(day)) {
            case 1, 3, 5, 7 -> "Es un dia impar"; // retorno automatico
            
            case 2, 4, 6 -> {
                if (day == 2) {
                    yield "Es el dia martes"; // retorno
                } else {
                    yield "Es un dia par";
                }
            }
            case Integer e when e > 10 && e < 20 -> "Rango permitdio";
            default -> {
                yield "No existe ese dia";
            }
        };

        System.out.println(result);

    }
}
