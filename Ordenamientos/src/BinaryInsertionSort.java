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
                    binaryInsertionSortNombres_Ma(0, lista.size() - 1);
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
                /*
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
    */ 
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
    //Mayor a menor
    private int binarySearchEdades_Ma(LinkedList<Nodo> list, int edad, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (edad == list.get(mid).getAge())
                return mid + 1;
            else if (edad > list.get(mid).getAge())
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    private void binaryInsertionSortEdades_Ma(int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            Nodo temp = lista.get(i);
            int loc = binarySearchEdades_Ma(lista, temp.getAge(), low, i - 1);
            for (int j = i - 1; j >= loc; j--) {
                lista.set(j + 1, lista.get(j));
            }
            lista.set(loc, temp);
        }
    }

    // Métodos para ordenar por edad (edades de menor a mayor)

    private int binarySearchEdades_Me(LinkedList<Nodo> list, int edad, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (edad == list.get(mid).getAge())
                return mid + 1;
            else if (edad < list.get(mid).getAge())
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
    private void binaryInsertionSortEdades_Me(int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            Nodo temp = lista.get(i);
            int loc = binarySearchEdades_Ma(lista, temp.getAge(), low, i - 1);
            for (int j = i - 1; j >= loc; j--) {
                lista.set(j + 1, lista.get(j));
            }
            lista.set(loc, temp);
        }
    }
    //ordenar nombres
    // Alfabetico
   
}
    public static int binarySearchNombres_Ma(LinkedList<Nodo> lista, String elemento, int low, int high) {//inicio es high, fin es low
        if (low <= high) {
            if (elemento.compareTo(lista.get(high).getNombre()) > 0) {
                return high + 1;
            } else {
                return high;
            }
        }

        int mid = (high + low) / 2;

        if (elemento.compareTo(lista.get(mid).getNombre()) == 0) {
            return mid + 1;
        }

        if (elemento.compareTo(lista.get(mid).getNombre()) > 0) {
            return binarySearchNombres_Ma(lista, elemento, mid + 1, low);
        } else {
            return binarySearchNombres_Ma(lista, elemento, high, mid - 1);
        }
    }

private void binaryInsertionSortNombres_Ma(int low, int high) {
    for (int i = low + 1; i <= high; i++) {
        Nodo temp = lista.get(i);
        int loc = binarySearchNombres_Ma(lista, temp.getNombre(), low, i - 1);
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



    public void printList(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; ++i)
            System.out.print(list.get(i) + " ");

        System.out.println();
    }

    
}
