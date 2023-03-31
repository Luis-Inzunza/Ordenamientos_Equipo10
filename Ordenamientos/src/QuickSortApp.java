import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import Data.LectorCSV;
import Data.Nodo;

public class QuickSortApp {
    private QuickSort quick = new QuickSort();
    private int tipo;
    private boolean MayorAmenor_invertido;

    public QuickSortApp(int _tipo, boolean _MayorAmenor_invertido){ 
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
}
