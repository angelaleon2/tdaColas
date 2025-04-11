package tdaColas;

public class ColaD implements Colas {
    private Nodo elPrimero;
    private Nodo elUltimo ;

    @Override
    public void crear() {

    }

    @Override
    public void encolar(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (elPrimero == null) {
            elPrimero = nuevo;
            elUltimo = nuevo;
        }
        else{
            //AGREGAMOS ELEMENTOS AL FINAL DE LA LISTA
            elUltimo.siguiente = nuevo;
            elUltimo = nuevo;
        }

    }

    @Override
    public void desencolar() {
        Nodo auxiliar = elPrimero;
        if (elPrimero == null){
            System.out.println("La cola esta vacia");
        }
        else{
            System.out.println("Se saca el elemento: "+auxiliar.elemento);
            elPrimero = auxiliar.siguiente;
        }

    }

    @Override
    public int frente() {
        if (elPrimero == null){
            System.out.println("Nada que mostrar... cola vacia");
            return 0;
        }
        else{
            System.out.println("Se entrega: "+elPrimero);
            return elPrimero.elemento;
        }


    }

    @Override
    public boolean estaVacia() {
        if (elPrimero == null)
            return true;
        else
            return false;
    }

    @Override
    public boolean estaLlena() {
        return false;
    }

    @Override
    public void verCola() {
        Nodo e = elPrimero;
        while (e!=null){
            System.out.print(" "+e.elemento+" ");
            e= e.siguiente;
        }
        System.out.println();
    }
}
class Nodo{
    public int elemento;
    public Nodo siguiente;
    public Nodo(int elemento){
        this.elemento = elemento;
        this.siguiente = null;
    }

}