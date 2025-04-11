package tdaColas;

public class ColaDinamica implements Colas {
    public Nodo2 elFrente=null;
    public Nodo2 elFinal = null;

    @Override
    public void crear() {

    }

    @Override
    public void encolar(int elemento) {

    }

    @Override
    public void desencolar() {

    }

    @Override
    public int frente() {
        return 0;
    }

    @Override
    public boolean estaVacia() {
        return false;
    }

    @Override
    public boolean estaLlena() {
        return false;
    }

    @Override
    public void verCola() {

    }
}
class Nodo2{
    private int elemento;
    private Nodo2 siguiente;
    public Nodo2(int elemento){
        this.elemento = elemento;
        this.siguiente = null;
    }
}
