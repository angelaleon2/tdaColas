package tdaColas;

public class PruebaColaD {
    public static void main(String[] args) {
        ColaD laCola = new ColaD();
       /* laCola.encolar(10);
        laCola.verCola();
        laCola.encolar(15);
        laCola.verCola();
        laCola.encolar(20);
        laCola.verCola();
        laCola.encolar(25);
        laCola.verCola();
        laCola.encolar(30);*/

        laCola.desencolar();
        laCola.encolar(10);
        laCola.verCola();
        laCola.encolar(15);
        laCola.verCola();
        laCola.desencolar();
        laCola.verCola();
        laCola.desencolar();
        laCola.verCola();
        laCola.encolar(100);
        laCola.verCola();
    }
}
