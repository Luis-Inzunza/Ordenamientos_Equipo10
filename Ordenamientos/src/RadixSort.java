// Radix sort Java implementation
import java.io.*;
import java.util.*;

import Data.Nodo;

public class RadixSort {
	private LinkedList<Nodo> lista = new LinkedList<>();
	public int cont_comparacion = 0;
    public int cont_intercambio = 0;

	public RadixSort(){ }

	public LinkedList<Nodo> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Nodo> lista) {
		this.lista = lista;
	}

    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    //-----------------------------------------------------------
    public RadixSort(int max)   {
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

	// A utility function to get maximum value in arr[]
	private long getMax(){
		long mx = theArray[0];
		for (int i = 1; i < nElems; i++)
			if (theArray[i] > mx)
				mx = theArray[i];
		return mx;
	}

	// A function to do counting sort of arr[] according to
	// the digit represented by exp.
	public void countSort(int exp){
		long[] output = new long[nElems]; // output array
		int i;
		long[] count = new long[10];
		Arrays.fill(count, 0);

		// Store count of occurrences in count[]
		for (i = 0; i < nElems; i++)
			count[(int) ((theArray[i] / exp) % 10)]++;

		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build the output array
		for (i = nElems - 1; i >= 0; i--) {
			output[(int) (count[(int) ((theArray[i] / exp) % 10)] - 1)] = theArray[i];
			count[(int) ((theArray[i] / exp) % 10)]--;
		}

		// Copy the output array to arr[], so that arr[] now
		// contains sorted numbers according to current digit
        theArray = Arrays.copyOf(output, output.length);
		
	}

	// The main function to that sorts arr[] of size n using
	// Radix Sort
	public void sort(){
		// Find the maximum number to know number of digits
		long m = getMax();

		// Do counting sort for every digit. Note that
		// instead of passing digit number, exp is passed.
		// exp is 10^i where i is current digit number
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(exp);
	}

	public void sort(int tipo, boolean MayorAmenor_invertido) {
		if (lista.size() <= 1) {
			return;
		}
	
		if(MayorAmenor_invertido){
			switch (tipo) {
				case 1:
					quicksortClases_Ma(0, lista.size() - 1);
					break;
	
				case 2:
					quicksortEdades_Ma(0, lista.size() - 1);
					break;
	
				case 3:
					quicksortNombres_Ma(0, lista.size() - 1);
					break;
			
				default:
					break;
			} 
	
		}else{
			switch (tipo) {
				case 1:
					quicksortClases_Me(0, lista.size() - 1);
					break;
	
				case 2:
					quicksortEdades_Me(0, lista.size() - 1);
					break;
	
				case 3:
					quicksortNombres_Me(0, lista.size() - 1);
					break;
			
				default:
					break;
			} 
	
		}
	}
}
/* This code is contributed by Devesh Agrawal */



