/*
 - El profe pide que los algortimos acepten listas enlazadas para ordenarlas.
 - Lo unico que el usuario debe poner es la eleccion de forma en la que se acomoda
 - Uso de hascode para convertir strings a numeros.
 */

import Data.LectorCSV;

public class App {
    public static void main(String[] args) throws Exception {
        LectorCSV datos = new LectorCSV("src/Data/train.csv");
        System.out.println("paso la lectura del archivo");
        datos.list.displaya();
        String hola = "hola mundo";
        System.out.println(hola.hashCode());

        //ordenemos edades por medio de binaryInsertionSort
        //pedimos a la lista de datos las edades y lo metemos en una variable
        int[] data = datos.list.getAges();   //la funcion getAges nos retorna un Array
        //dicho array se puede usar como argumento para sortear
        BinaryInsertionSort binary = new BinaryInsertionSort();
        binary.binaryInsertionSort(data, data.length);  //en teoria esto debe ordenar las edades con el ordenamiento default


    }
}
