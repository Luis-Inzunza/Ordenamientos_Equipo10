import java.util.LinkedList;


public class StringQuickSort {

    private LinkedList<String> theList;  // ref to list theList
    
    private boolean esMayor(String a, String b) {
        int i = 0;
        while (i < a.length() && i < b.length()) {
            if (a.charAt(i) > b.charAt(i)) {
                return false;
            } else if (a.charAt(i) < b.charAt(i)) {
                return true;
            }
            i++;
        }
        return a.length() > b.length();
    }

    public StringQS(LinkedList<String> list) {
        theList = list;
    }

    public void display() {
        for(int j=0; j<theList.size(); j++) {  // for each element,
            System.out.print(theList.get(j) + " ");  // display it
        }
        System.out.println("");
    }

    void swap(int i, int j){
        String temp = theList.get(i);   //temp almacena del dato, por lo que varia segun lo deseado
        theList.set(i, theList.get(j));
        theList.set(j, temp);
    }

    /*
    toma el ultimo elemento como pivote,
    coloca el pivote en su posicion correcta del arreglo ordenado,
    coloca todos los valores mas pequenioos (menores a los pivotes)
    a la izquierda del pivote y coloca todos los valores mas grandes
    (mayores a los pivotes) a la derecha del pivote
    */
    
    int partition(int low, int high) {
        String pivot = theList.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (esMayor(theList.get(j), pivot)) {  // si elemento en j es mayor que el pivote
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }
    

    /* The main function that implements QuickSort
            arr[] --> Array to be sorted,   //ya esta cambiado para aceptar lista en lugar de arrays
            low --> Starting index,
            high --> Ending index
    */
    public void recQSort(int low, int high){
        if (low < high){
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(low, high);

            // Separately sort elements before
            // partition and after partition
            recQSort(low, pi - 1);
            recQSort(pi + 1, high);
        }
    }
}