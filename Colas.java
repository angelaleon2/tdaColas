package tdaColas;
/*
•	crear(): inicializa una cola vacía.
•	encolar(e): inserta el elemento e al final de la cola.
•	desencolar(): elimina el elemento en el frente de la cola.
•	frente(): devuelve el elemento en el frente sin eliminarlo.
•	esta_vacia(): devuelve true si la cola está vacía.
    esta_llena(): devuelve true si la cola está llena.

*/

public interface Colas {
    public void crear();
    public void encolar(int elemento);
    public void desencolar();
    public int frente();
    public boolean estaVacia();
    public boolean estaLlena();
    public void verCola();
}
