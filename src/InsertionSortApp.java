public class InsertionSortApp {
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        InsertionSort iso = new InsertionSort();
        iso.insertSort(arr);
        System.out.println("Arreglo ordenado:");
        iso.printArray(arr);
    }
}
