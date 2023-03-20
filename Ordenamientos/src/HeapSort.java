public class HeapSort {
   
   private long[] theArray;          // ref to array theArray
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public HeapSort(int max)   {
      theArray = new long[max];      // create array
      nElems = 0;
   }
   
   //-----------------------------------------------------------
   public void insert(long value){
      theArray[nElems] = value;      // insert it
      nElems++;                      // increment size
   }

   public void display() {
      for(int j=0; j<nElems; j++)    // for each element,
         System.out.print(theArray[j] + " ");  // display it
      System.out.println("");
    }

   public void sort(){
       int n = nElems;

       // Build heap (rearrange array)
       for (int i = n / 2 - 1; i >= 0; i--)
           heapify(n, i);

       // One by one extract an element from heap
       for (int i = n - 1; i > 0; i--) {
           long temp = theArray[0]; // Move current root to end
           theArray[0] = theArray[i];
           theArray[i] = temp;
           heapify(i, 0);   // call max heapify on the reduced heap
       }
   }

   // To heapify a subtree rooted with node i which is
   // an index in theArray[]. n is size of heap
   void heapify(int n, int i){
       int largest = i; // Initialize largest as root
       int l = 2 * i + 1; // left = 2*i + 1
       int r = 2 * i + 2; // right = 2*i + 2

       // If left child is larger than root
       if (l < n && theArray[l] > theArray[largest])
           largest = l;

       // If right child is larger than largest so far
       if (r < n && theArray[r] > theArray[largest])
           largest = r;

       // If largest is not root
       if (largest != i) {
           long swap = theArray[i];
           theArray[i] = theArray[largest];
           theArray[largest] = swap;

           // Recursively heapify the affected sub-tree
           heapify(n, largest);
       }
   }
}