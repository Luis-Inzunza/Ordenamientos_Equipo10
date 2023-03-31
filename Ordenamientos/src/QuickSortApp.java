import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Data.LectorCSV;
import Data.Nodo;

public class QuickSortApp {
    private QuickSort quick = new QuickSort();
    private int tipo;
    private boolean MayorAmenor_invertido;
    private long tiempoTotal = 0;

    public QuickSortApp(int _tipo, boolean _MayorAmenor_invertido){ 
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

    public void print(){
        printCSV();
        printMetrics();
    }

    private void printMetrics(){
        String rutaArchivo = "src/Algoritmo_Data/Metrics.csv";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))) {

            ultimaLinea(rutaArchivo);

            escritor.write("QuickSort");
            escritor.newLine();
            escritor.write("Tiempo de ejecucion: " + tiempoTotal + " milisegundos, Comparaciones: "+quick.cont_comparacion + ". Intercambios: "+ quick.cont_intercambio);

            System.out.println("Datos escritos correctamente en el archivo " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void printCSV(){
        String rutaArchivo = "src/Algoritmo_Data/QuickSort_ordenado.csv";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))) {

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
}
