import java.util.ArrayList;
import java.util.LinkedList;

public class QuickSortApp {
    public static void main(String[] args) {
        LinkedList<Integer> lista2 = new LinkedList<Integer>();
        LinkedList<String> listaString = new LinkedList<String>();
        //qs con datos numericos
        lista2.add(5);
        lista2.add(24);
        lista2.add(15);
        lista2.add(1);
        lista2.add(97);

       //qs para datos alfanumericos
        listaString.add("juan");
        listaString.add("alberto");
        listaString.add("basto");
        listaString.add("castro");

        QuickSort qSort = new QuickSort(lista2); //qs normal
        StringQuickSort stringQS = new StringQuickSort(listaString);  //qs de cadenas

       

        qSort.display();                 // display items
        
        qSort.recQSort(0,lista2.size()-1);         //low posicion inicial en la lista para revisar y el otro el limite 
 
        qSort.display();                // display items

        stringQS.display();

        stringQS.recQSort(0, listaString.size()-1);
        stringQS.display();
    }
}
