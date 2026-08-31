package basic.c11_POO;

public class Herencia {

    /* -------- Herencia de clases y polimorfismo ----------
    
    Herencia: consiste en heredad propiedad y metodos de la clase padre desde la HIja

    Polimorfismo: consiste en modifiar un mismo metodo del padre en las hijas
    */
    public static class Vehiculo {
        String marca;
        String modelo;
        protected int agno;

        public Vehiculo(String marca, String modelo, int agno) {
            this.marca = marca;
            this.modelo = modelo;
            this.agno = agno;
        }

        public void mover(){
            System.out.println("Vehiculo esta moviendo");
        }

        protected void explotar() {
            System.out.println("Vehiculo explotado");
        }
    }

    public static class Carro extends Vehiculo{
        int nPuertas;

        public Carro(int nPuertas, String marca, String modelo, int agno) {
            super(marca, modelo, agno);
            this.nPuertas = nPuertas;
        }
    }

    public static class Avion extends Vehiculo {
        public Avion(String marca, String modelo, int agno) {
            super(marca, modelo, agno);
        }

        @Override  // se usa porque se modificara el metodo del padre (polimorfismo)
        public void mover() {
            System.out.println("Avion esta volando");
        }
    }

    public static class Barco extends Vehiculo {
        int anclas;

        public Barco(int anclas, String marca, String modelo, int agno) {
            super(marca, modelo, agno);
            this.anclas = anclas;
        }

        @Override
        public void mover() {
            System.out.println("Brco navegando");
        }
    }
}
