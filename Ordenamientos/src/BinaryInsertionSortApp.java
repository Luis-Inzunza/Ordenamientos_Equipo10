import java.util.LinkedList;

public class BinaryInsertionSortApp {
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