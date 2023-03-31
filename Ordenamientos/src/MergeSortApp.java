import java.util.Iterator;
import java.util.LinkedList;

import Data.LectorCSV;
import Data.Nodo;

public class MergeSortApp {
   private MergeSort quick = new MergeSort();
   private int tipo;
   private boolean MayorAmenor_invertido;

   public MergeSortApp(int _tipo, boolean _MayorAmenor_invertido){
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


   ///////////////////////////////////////////////////////////////
   public static void main(String[] args) {
      LinkedList<Integer> theList = new LinkedList<Integer>();
      theList.add(9);
      theList.add(7);
      theList.add(5);
      theList.add(3);
      theList.add(1);
      MergeSort sorter = new MergeSort();
      for (int i = 0; i < theList.size(); i++) {
         sorter.insert(theList.get(i));
      }
      sorter.display();
      sorter.mergeSort();
      sorter.display();
   }
}