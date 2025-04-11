package tdaColas;

public class Cola implements Colas {
    int[] datos;
    private int frente, fin, cantidad, capacidad;
    public Cola(int capacidad){
        this.capacidad = capacidad;
        datos = new int[capacidad];
        frente = 0;
        fin = -1;
        cantidad = 0;
    }


    @Override
    public void crear() {

    }

    @Override
    public void encolar(int elemento) {
        if (cantidad == capacidad){
            System.out.println("Cola esta completa..");
        } else {
            fin = (fin + 1) % capacidad;
            datos[fin] = elemento;
            System.out.println("Agregado "+datos[fin]+" en la posicion "+fin);
            cantidad++;
        }
    }

    @Override
    public void desencolar() {
        int auxiliar;
        if (cantidad == 0){
            System.out.println("No hay elementos. Cola Vacia");
        }
        else {
            auxiliar = datos[frente];
            frente = (frente + 1) % capacidad;
           /* if (frente == fin){
                fin =-1;
                frente = 0;
            }*/
            cantidad--;
            System.out.println(("Se elimino el elemento "+auxiliar));
        }
    }

    @Override
    public int frente() {
        int auxiliar;
        if (cantidad == 0){
            System.out.println("No hay elementos. Cola Vacia");
            return 0;
        }
        else {
            auxiliar = datos[frente];
            System.out.println(("Se atiende ele elemento"+auxiliar));
            return auxiliar;
        }
    }

    @Override
    public boolean estaVacia() {
        if (cantidad == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean estaLlena() {
        if (cantidad == capacidad)
            return true;
        else
            return false;
    }

    @Override
    public void verCola() {
        if (estaVacia()){
            System.out.println("Cola sin elementos");
            return;
        }

        System.out.print("Contenido de la cola: ");
        for (int i = 0; i < cantidad; i++) {
            int indice = (frente +i) % capacidad;
            System.out.print(datos[indice] + " ");
        }
        System.out.println();


    }
}
