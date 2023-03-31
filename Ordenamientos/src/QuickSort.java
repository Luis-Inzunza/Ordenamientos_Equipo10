import java.util.LinkedList;
import Data.Nodo;

public class QuickSort {
    private LinkedList<Nodo> lista;

    public QuickSort(){ }

    public QuickSort(LinkedList<Nodo> lista) {
        this.lista = lista;
    }

    public void setLista(LinkedList<Nodo> lista) {
        this.lista = lista;
    }

    public LinkedList<Nodo> getLista() {
        return lista;
    }

    public void sort() {
        if (lista.size() <= 1) {
            return;
        }
        quicksort(0, lista.size() - 1);
    }

    private void quicksort(int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        Nodo pivote = lista.get(fin);
        int particion = particionar(inicio, fin, pivote);
        quicksort(inicio, particion - 1);
        quicksort(particion + 1, fin);
    }

    private int particionar(int inicio, int fin, Nodo pivote) {
        int i = inicio;
        int j = fin;
        while (i < j) {
            while (lista.get(i).getAge() < pivote.getAge() && i < j) {
                i++;
            }
            while (lista.get(j).getAge() >= pivote.getAge() && i < j) {
                j--;
            }
            if (i < j) {
                intercambiar(i, j);
            }
        }
        if (lista.get(i).getAge() >= pivote.getAge()) {
            intercambiar(i, fin);
        } else {
            i++;
        }
        return i;
    }

    private void intercambiar(int i, int j) {
        Nodo temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }

    public void display(){

    }
}
