import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import Data.LectorCSV;
import Data.Nodo;

public class BinaryInsertionSortApp {
    private BinaryInsertionSort quick = new BinaryInsertionSort();
    private int tipo;
    private boolean MayorAmenor_invertido;
    private long tiempoTotal = 0;
 
    public BinaryInsertionSortApp(int _tipo, boolean _MayorAmenor_invertido){
        this.tipo = _tipo;
        this.MayorAmenor_invertido = _MayorAmenor_invertido;
        
        long inicio = System.currentTimeMillis();
        sort();
        long fin = System.currentTimeMillis();
        tiempoTotal = fin - inicio;
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
            escritor.write("BinaryInsertionSort");
            escritor.newLine();
            escritor.write("Tiempo de ejecucion: " + tiempoTotal + " milisegundos, Comparaciones: "+quick.cont_comparacion + ". Intercambios: "+ quick.cont_intercambio);

            System.out.println("Datos escritos correctamente en el archivo " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void printCSV(){
        String rutaArchivo = "src/Algoritmo_Data/BinaryInsertionSort_ordenado.csv";
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

    private void ultimaLinea(String archivo) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
    
        while ((linea = br.readLine()) != null) { }
    
    }



///////////////////////////////////////////////

    
}