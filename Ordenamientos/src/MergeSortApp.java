import java.util.LinkedList;

public class MergeSortApp {
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