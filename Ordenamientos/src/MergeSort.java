import java.util.LinkedList;
import Data.Nodo;

public class MergeSort{
	private LinkedList<Nodo> lista = new LinkedList<>();
   private int tipo = 0;
   private boolean MayorAmenor_invertido;
   public int cont_comparacion = 0;
   public int cont_intercambio = 0;

	public LinkedList<Nodo> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Nodo> lista) {
		this.lista = lista;
	}

   public void setTipo(int tipo) {
      this.tipo = tipo;
   }

   public void setMayorAmenor_invertido(boolean mayorAmenor_invertido) {
      MayorAmenor_invertido = mayorAmenor_invertido;
   }




   public void mergesort(LinkedList<Nodo> lista){
      if (lista.size() > 1) {
         // Divide la lista en dos mitades
         LinkedList<Nodo> mitadIzquierda = new LinkedList<>();
         LinkedList<Nodo> mitadDerecha = new LinkedList<>();
         int mitad = lista.size() / 2;
         for (int i = 0; i < mitad; i++) {
             mitadIzquierda.add(lista.get(i));
         }
         for (int i = mitad; i < lista.size(); i++) {
             mitadDerecha.add(lista.get(i));
         }

         // Ordena las dos mitades de manera recursiva
         mergesort(mitadIzquierda);
         mergesort(mitadDerecha);
         sort(mitadIzquierda, mitadDerecha);
         setLista(lista);
      }
   }

	public void sort(LinkedList<Nodo> izquierda, LinkedList<Nodo> derecha) {
		if (lista.size() <= 1) {
			return;
		}
	
		if(MayorAmenor_invertido){
			switch (tipo) {
				case 1:
					mergesortClases_Ma(izquierda, derecha);
					break;
	
				case 2:
					mergesortEdades_Ma(izquierda, derecha);
					break;
	
				case 3:
					mergesortNombres_Ma(izquierda, derecha);
					break;
			
				default:
					break;
			} 
	
		}else{
			switch (tipo) {
				case 1:
					mergesortClases_Me(izquierda, derecha);
					break;
	
				case 2:
					mergesortEdades_Me(izquierda, derecha);
					break;
	
				case 3:
					mergesortNombres_Me(izquierda, derecha);
					break;
			
				default:
					break;
			} 
	
		}
	}


   private void mergesortEdades_Ma(LinkedList<Nodo> mitadIzquierda,LinkedList<Nodo> mitadDerecha){
      if (mitadIzquierda != null && mitadDerecha != null){
         int i = 1;
         int j = 0;
         int k = 0;
         while (i < mitadIzquierda.size() && j < mitadDerecha.size()) {
            if(mitadIzquierda.get(i).getAge() < mitadDerecha.get(j).getAge()) {
               lista.set(k, mitadIzquierda.get(i));
               i++;
            } else {
               lista.set(k, mitadDerecha.get(j));
               j++;
            }
            k++;
         }
         while (i <= mitadIzquierda.size()) {
            lista.set(k, mitadIzquierda.get(i));
            i++;
            k++;
         }
         while (j <= mitadDerecha.size()) {
            lista.set(k, mitadDerecha.get(j));
            j++;
            k++;
         }
      }
   }

   private void mergesortClases_Ma(LinkedList<Nodo> mitadIzquierda,LinkedList<Nodo> mitadDerecha){
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < mitadIzquierda.size() && j < mitadDerecha.size()) {
         if(mitadIzquierda.get(i).getAge() < mitadDerecha.get(j).getAge()) {
            lista.set(k, mitadIzquierda.get(i));
            i++;
         } else {
            lista.set(k, mitadDerecha.get(j));
            j++;
         }
         k++;
      }
      while (i < mitadIzquierda.size()) {
         lista.set(k, mitadIzquierda.get(i));
         i++;
         k++;
      }
      while (j < mitadDerecha.size()) {
         lista.set(k, mitadDerecha.get(j));
         j++;
         k++;
      }
   }

   private void mergesortNombres_Ma(LinkedList<Nodo> mitadIzquierda,LinkedList<Nodo> mitadDerecha){
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < mitadIzquierda.size() && j < mitadDerecha.size()) {
         if(mitadIzquierda.get(i).getAge() < mitadDerecha.get(j).getAge()) {
            lista.set(k, mitadIzquierda.get(i));
            i++;
         } else {
            lista.set(k, mitadDerecha.get(j));
            j++;
         }
         k++;
      }
      while (i < mitadIzquierda.size()) {
         lista.set(k, mitadIzquierda.get(i));
         i++;
         k++;
      }
      while (j < mitadDerecha.size()) {
         lista.set(k, mitadDerecha.get(j));
         j++;
         k++;
      }
   }

   private void mergesortEdades_Me(LinkedList<Nodo> mitadIzquierda,LinkedList<Nodo> mitadDerecha){
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < mitadIzquierda.size() && j < mitadDerecha.size()) {
         if(mitadIzquierda.get(i).getAge() < mitadDerecha.get(j).getAge()) {
            lista.set(k, mitadIzquierda.get(i));
            i++;
         } else {
            lista.set(k, mitadDerecha.get(j));
            j++;
         }
         k++;
      }
      while (i < mitadIzquierda.size()) {
         lista.set(k, mitadIzquierda.get(i));
         i++;
         k++;
      }
      while (j < mitadDerecha.size()) {
         lista.set(k, mitadDerecha.get(j));
         j++;
         k++;
      }
   }

   private void mergesortClases_Me(LinkedList<Nodo> mitadIzquierda,LinkedList<Nodo> mitadDerecha){
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < mitadIzquierda.size() && j < mitadDerecha.size()) {
         if(mitadIzquierda.get(i).getAge() < mitadDerecha.get(j).getAge()) {
            lista.set(k, mitadIzquierda.get(i));
            i++;
         } else {
            lista.set(k, mitadDerecha.get(j));
            j++;
         }
         k++;
      }
      while (i < mitadIzquierda.size()) {
         lista.set(k, mitadIzquierda.get(i));
         i++;
         k++;
      }
      while (j < mitadDerecha.size()) {
         lista.set(k, mitadDerecha.get(j));
         j++;
         k++;
      }
   }

   private void mergesortNombres_Me(LinkedList<Nodo> mitadIzquierda,LinkedList<Nodo> mitadDerecha){
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < mitadIzquierda.size() && j < mitadDerecha.size()) {
         if(mitadIzquierda.get(i).getAge() < mitadDerecha.get(j).getAge()) {
            lista.set(k, mitadIzquierda.get(i));
            i++;
         } else {
            lista.set(k, mitadDerecha.get(j));
            j++;
         }
         k++;
      }
      while (i < mitadIzquierda.size()) {
         lista.set(k, mitadIzquierda.get(i));
         i++;
         k++;
      }
      while (j < mitadDerecha.size()) {
         lista.set(k, mitadDerecha.get(j));
         j++;
         k++;
      }
   }


   
}

/*
 * 

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
 */