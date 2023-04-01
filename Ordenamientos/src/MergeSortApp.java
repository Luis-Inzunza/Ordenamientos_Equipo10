import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import Data.LectorCSV;
import Data.Nodo;

public class MergeSortApp {
   private MergeSort quick = new MergeSort();
   private long tiempoTotal = 0;

   public MergeSortApp(int _tipo, boolean _MayorAmenor_invertido){
       quick.setTipo(_tipo);
       quick.setMayorAmenor_invertido(_MayorAmenor_invertido);
       long inicio = System.currentTimeMillis();
       sort();
       long fin = System.currentTimeMillis();
       tiempoTotal = fin - inicio;
    }

   private void sort(){
       LectorCSV datos = new LectorCSV("src/Data/train.csv");
       quick.setLista(datos.list);
       quick.mergesort(datos.list);
    }

   public LinkedList getList(){
       return quick.getLista();
    }

   public void display(){
       Iterator<Nodo> i = getList().iterator();
       while(i.hasNext()){
        System.out.println(i.next().toString());
       }
    }

    public void print(){
        printCSV();
        printMetrics();
    }

    private void printMetrics(){
        String rutaArchivo = "src/Algoritmo_Data/Metrics.csv";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo,true))) {
            escritor.write("MergeShort");
            escritor.newLine();
            escritor.write("Tiempo de ejecucion: " + tiempoTotal + " milisegundos, Comparaciones: "+quick.cont_comparacion + ". Intercambios: "+ quick.cont_intercambio);

            System.out.println("Datos escritos correctamente en el archivo " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void printCSV(){
        String rutaArchivo = "src/Algoritmo_Data/MergeSort_ordenado.csv";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))) {

            // Escribir los datos en el archivo CSV
            escritor.write("PassengerId,Survived,class,Name,Sex,Age");
            escritor.newLine();

            for (Nodo fila : quick.getLista()) {
                escritor.write(fila.toString());
                escritor.newLine();
            }

            System.out.println("Datos escritos correctamente en el archivo " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


   ///////////////////////////////////////////////////////////////

   /*
    *    public static void main(String[] args) {
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
    */
}