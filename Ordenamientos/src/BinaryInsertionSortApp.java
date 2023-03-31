import java.util.Iterator;
import java.util.LinkedList;

import Data.LectorCSV;
import Data.Nodo;

public class BinaryInsertionSortApp {
    private BinaryInsertionSort quick = new BinaryInsertionSort();
    private int tipo;
    private boolean MayorAmenor_invertido;
 
    public BinaryInsertionSortApp(int _tipo, boolean _MayorAmenor_invertido){
        this.tipo = _tipo;
        this.MayorAmenor_invertido = _MayorAmenor_invertido;
        sort();
    }
 
    private void sort(){
        LectorCSV datos = new LectorCSV("src/Data/train.csv");
        quick.setLista(datos.list);
        quick.sort(tipo, MayorAmenor_invertido);
    }
 
    public LinkedList getList(){
        return quick.getLista();
    }
 
    public void display(){
        Iterator<Nodo> i = getList().iterator();
        while(i.hasNext()){
            System.out.println(i.next().display());
        }
    }




///////////////////////////////////////////////

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        BinaryInsertionSort binSort = new BinaryInsertionSort();
        lista.add(5);
        lista.add(493);
        lista.add(1);
        lista.add(45);
        lista.add(5);
        lista.add(493);
        lista.add(1);
        lista.add(45);
        binSort.binaryInsertionSort(lista, 0);
        System.out.println(lista);
       
    }
}