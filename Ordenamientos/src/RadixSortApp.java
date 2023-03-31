import java.util.Iterator;
import java.util.LinkedList;

import Data.LectorCSV;
import Data.Nodo;

public class RadixSortApp {
    private RadixSort quick = new RadixSort();
    private int tipo;
    private boolean MayorAmenor_invertido;

    public RadixSortApp(int _tipo, boolean _MayorAmenor_invertido){
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

//////////////// Base lo de abajo, arriba lo nuevo /////////

    public static void main(String[] args){
        int maxSize = 100;  
        RadixSort radix = new RadixSort(maxSize);

        radix.insert(64);                // insert items
        radix.insert(21);
        radix.insert(33);
        radix.insert(70);
        radix.insert(12);
        radix.insert(85);
        radix.insert(44);
        radix.insert(3);
        radix.insert(99);
        radix.insert(0);
        radix.insert(108);
        radix.insert(36);

        radix.display();                 // display items
        
        radix.sort();
                    // array size

        radix.display();                 // display items
    }
}    
