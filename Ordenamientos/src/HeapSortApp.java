public class HeapSortApp{
    public static void main(String[] args){
        int maxSize = 100;             // array size
        HeapSort heapSort = new HeapSort(maxSize);

        heapSort.insert(64);                // insert items
        heapSort.insert(21);
        heapSort.insert(33);
        heapSort.insert(70);
        heapSort.insert(12);
        heapSort.insert(85);
        heapSort.insert(44);
        heapSort.insert(3);
        heapSort.insert(99);
        heapSort.insert(0);
        heapSort.insert(108);
        heapSort.insert(36);

        heapSort.display();                 // display items
        heapSort.sort();
        heapSort.display();                 // display items
    }
}