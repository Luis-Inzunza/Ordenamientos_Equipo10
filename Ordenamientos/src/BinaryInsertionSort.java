import java.util.LinkedList;

public class BinaryInsertionSort {  //version para listas enlazadas con datos enteros
    public int binarySearch(LinkedList<Integer> list, int item, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item == list.get(mid))
                return mid + 1;
            else if (item > list.get(mid))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public void binaryInsertionSort(LinkedList<Integer> list, int n) {
        int i, loc, j, selected;

        for (i = 1; i < n; ++i) {
            j = i - 1;
            selected = list.get(i);

            // encuentra la posicion donde debe ser insertado el elemento
            loc = binarySearch(list, selected, 0, j);

            // Hace un corrimiento a la derecha de los datos
            while (j >= loc) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, selected);
        }
    }

    public void printList(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; ++i)
            System.out.print(list.get(i) + " ");

        System.out.println();
    }
}
