import java.util.Arrays;

public class CountingSort {
    private char[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    //-----------------------------------------------------------
    public CountingSort(int max)   {
        theArray = new char[max];      // create array
        nElems = 0;
    }
    
    //-----------------------------------------------------------
    public void insert(char value){
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }

    public void display() {
        for(int j=0; j<nElems; j++)    // for each element,
            System.out.print(theArray[j] + " ");  // display it
        System.out.println("");
    }

	void sort() {
		int n = nElems;

		// The output character array that will have sorted arr
		char[] output = new char[n];

		// Create a count array to store count of individual
		// characters and initialize count array as 0
		int[] count = new int[256];
		for (int i = 0; i < 256; ++i)
			count[i] = 0;

		// store count of each character
		for (int i = 0; i < n; ++i)
			++count[theArray[i]];

		// Change count[i] so that count[i] now contains actual
		// position of this character in output array
		for (int i = 1; i <= 255; ++i)
			count[i] += count[i - 1];

		// Build the output character array
		// To make it stable we are operating in reverse order.
		for (int i = n - 1; i >= 0; i--) {
			output[count[theArray[i]] - 1] = theArray[i];
			--count[theArray[i]];
		}

		// Copy the output array to theArray, so that theArray now
		// contains sorted characters
        theArray = Arrays.copyOf(output, output.length);

	}
}   

