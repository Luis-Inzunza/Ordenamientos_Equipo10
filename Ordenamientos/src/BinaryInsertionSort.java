import java.util.LinkedList;

import Data.Nodo;

public class BinaryInsertionSort { //version para listas enlazadas con datos enteros

    private LinkedList<Nodo> lista = new LinkedList<>();
    public int cont_comparacion = 0;
    public int cont_intercambio = 0;

	public LinkedList<Nodo> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Nodo> lista) {
		this.lista = lista;
	}

    public void sort(int tipo, boolean MayorAmenor_invertido) {
        if (lista.size() <= 1) {
            return;
        }

        if(MayorAmenor_invertido){
            switch (tipo) {
                case 1:
                    binaryInsertionSortClases_Ma(0, lista.size() - 1);
                    break;
    
                case 2:
                    binaryInsertionSortEdades_Ma(0, lista.size() - 1);
                    break;
    
                case 3:
                    binaryInsertionSortNombres_Ma();
                    break;
            
                default:
                    break;
            } 

        }else{
            switch (tipo) {
                case 1:
                    binaryInsertionSortClases_Me(0, lista.size() - 1);
                    break;
    
                case 2:
                    binaryInsertionSortEdades_Me(0, lista.size() - 1);
                    break;
    
                case 3:
                    binaryInsertionSortNombres_Me(0, lista.size() - 1);
                    break;
            
                default:
                    break;
            } 

        }
    }
  
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
    //bIS para la Clases Mayor-Menor

    public int binarySearchClases(int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (lista.get(mid).getClase().compareTo(key) == 0) {
                return mid + 1;
            } else if (lista.get(mid).getClase().compareTo(key) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
        //Sort Clase
    public void binaryInsertionSortClases_Ma(int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            Nodo temp = lista.get(i);
            int j = i - 1;
            int loc = binarySearchClases(low, j, temp.getClase());
            while (j >= loc) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, temp);
        }
    }

    public void binaryInsertionSortClases_Me(int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            Nodo temp = lista.get(i);
            int j = i - 1;
            int loc = binarySearchClases(low, j, temp.getClase());
            while (j <= loc) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, temp);
        }
    }
    // Sort Edades
    //Orden Descendente (mayor a menor osea Ma)
    public int binarySearchEdades_Ma(LinkedList<Nodo> list, int edad, int low, int high) {
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (edad == list.get(mid).getAge())
            return mid + 1;
        else if (edad < list.get(mid).getAge()) // Cambio aquí
            low = mid + 1;
        else
            high = mid - 1;
    }
    return low;
}

public void binaryInsertionSortEdades_Ma(int low, int high) {
    for (int i = low + 1; i <= high; i++) {
        Nodo temp = lista.get(i);
        int loc = binarySearchEdades_Ma(lista, temp.getAge(), low, i - 1);
        for (int j = i - 1; j >= loc; j--) {
            if (lista.get(j).getAge() < temp.getAge()) {
                lista.set(j + 1, lista.get(j));
            } else {
                lista.set(j + 1, temp);
                break;
            }
        }
        if (loc != i) {
            lista.set(loc, temp);
        }
    }
}


    // Métodos para ordenar por edad (edades de menor a mayor)
    //orden Ascendente (menor a mayor osea Me)
    public int binarySearchEdades_Me(LinkedList<Nodo> list, int edad, int low, int high) {
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (edad == list.get(mid).getAge())
            return mid + 1;
        else if (edad < list.get(mid).getAge())
            high = mid - 1; // Cambio aquí
        else
            low = mid + 1;
    }
    return low;
}

public void binaryInsertionSortEdades_Me(int low, int high) {
    for (int i = low + 1; i <= high; i++) {
        Nodo temp = lista.get(i);
        int loc = binarySearchEdades_Me(lista, temp.getAge(), low, i - 1);
        for (int j = i - 1; j >= loc; j--) {
            if (lista.get(j).getAge() > temp.getAge()) { // Cambio aquí
                lista.set(j + 1, lista.get(j)); // Cambio aquí
            } else {
                lista.set(j + 1, temp);
                break;
            }
        }
        if (loc != i) {
            lista.set(loc, temp);
        }
    }
}


    //ordenar nombres
    ///////////////////Alfabetico///////////////////////////////
   public static int binarySearchNombres_Ma(LinkedList<Nodo> lista, String elemento, int low, int high) {
    if (low >= high) {
        if (elemento.compareTo(lista.get(low).getNombre()) > 0) {
            return low + 1;
        } else {
            return low;
        }
    }

    int mid = (low + high) / 2;

    if (elemento.compareTo(lista.get(mid).getNombre()) == 0) {
        return mid;
    }

    if (elemento.compareTo(lista.get(mid).getNombre()) > 0) {
        return binarySearchNombres_Ma(lista, elemento, mid + 1, high);
    } else {
        return binarySearchNombres_Ma(lista, elemento, low, mid - 1);
    }
}

public void binaryInsertionSortNombres_Ma() {
    int n = lista.size()-1;
    for (int i = 1; i < n; i++) {
        Nodo temp = lista.get(i);
        int loc = binarySearchNombres_Ma(lista, temp.getNombre(), 0, i - 1);
        for (int j = i - 1; j >= loc; j--) {
            lista.set(j + 1, lista.get(j));
        }
        lista.set(loc, temp);
    }
}

public boolean esMayor(Nodo a, Nodo b) {
        int i = 0;
        while (i < a.getNombre().length() && i < b.getNombre().length()) {
            if (a.getNombre().charAt(i) > b.getNombre().charAt(i)) {
                cont_comparacion++;
                return false;
            } else if (a.getNombre().charAt(i) < b.getNombre().charAt(i)) {
                cont_comparacion++;
                return true;
            }
            i++;
        }
        return a.getNombre().length() > b.getNombre().length();
    }
    //orden Alfabetico inverso/////////

    public static int binarySearchNombres_Me(LinkedList<Nodo> lista, String elemento, int low, int high) {
    if (low > high) {
        return low;
    }

    int mid = (low + high) / 2;

    if (elemento.compareTo(lista.get(mid).getNombre()) > 0) {
        return binarySearchNombres_Me(lista, elemento, mid + 1, high);
    } else {
        return binarySearchNombres_Me(lista, elemento, low, mid - 1);
    }
}



    public void binaryInsertionSortNombres_Me(int low, int high) {
    for (int i = low + 1; i <= high; i++) {
        Nodo temp = lista.get(i);
        int loc = binarySearchNombres_Me(lista, temp.getNombre(), low, i - 1);
        for (int j = i - 1; j >= loc + 1; j--) {
            lista.set(j + 1, lista.get(j));
        }
        lista.set(loc + 1, temp);
    }
}

public boolean esMenor(Nodo a, Nodo b) {
    int i = 0;
    while (i < a.getNombre().length() && i < b.getNombre().length()) {
        if (a.getNombre().charAt(i) > b.getNombre().charAt(i)) {
            cont_comparacion++;
            return true;
        } else if (a.getNombre().charAt(i) < b.getNombre().charAt(i)) {
            cont_comparacion++;
            return false;
        }
        i++;
    }
    return a.getNombre().length() > b.getNombre().length();
}


    public void printList(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; ++i)
            System.out.print(list.get(i) + " ");

        System.out.println();
    }

    


    
}

