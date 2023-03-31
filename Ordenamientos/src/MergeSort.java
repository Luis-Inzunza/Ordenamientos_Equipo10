import java.util.LinkedList;
import Data.Nodo;

public class MergeSort{
   private LinkedList<Integer> theList;    // ref to linked list theList
   private int nElems;                  // number of data items

   public MergeSort() {
      theList = new LinkedList<>(); // create linked list
      nElems = 0;
   }

   public void insert(int value) {
      theList.add(value);               // insert value
      nElems++;                         // increment size
   }

   public void display() {
      for(int value : theList) {       // for each element
         System.out.print(value + " "); // display it
      }
      System.out.println("");
   }

   public void mergeSort() {
      LinkedList<Integer> workSpace = new LinkedList<>();
      recMergeSort(workSpace, 0, nElems-1);
   }

   private void recMergeSort(LinkedList<Integer> workSpace, int lowerBound, int upperBound) {
      if(lowerBound == upperBound)            // if range is 1,
         return;                              // no use sorting
      else {                                    
         int mid = (lowerBound+upperBound) / 2; // find midpoint        
         recMergeSort(workSpace, lowerBound, mid); // sort low half
         recMergeSort(workSpace, mid+1, upperBound); // sort high half
         merge(workSpace, lowerBound, mid+1, upperBound); // merge them
      }  // end else
   }  // end recMergeSort()

   private void merge(LinkedList<Integer> workSpace, int lowPtr, int highPtr, int upperBound) {
      int j = 0;                             // workspace index
      int lowerBound = lowPtr;
      int mid = highPtr-1;
      int n = upperBound-lowerBound+1;       // # of items

      while(lowPtr <= mid && highPtr <= upperBound)
         if(theList.get(lowPtr) < theList.get(highPtr))
            workSpace.add(theList.get(lowPtr++));
         else
            workSpace.add(theList.get(highPtr++));

      while(lowPtr <= mid)
         workSpace.add(theList.get(lowPtr++));

      while(highPtr <= upperBound)
         workSpace.add(theList.get(highPtr++));

      for(j=0; j<n; j++)
         theList.set(lowerBound+j, workSpace.get(j));
      workSpace.clear();
   }
}

