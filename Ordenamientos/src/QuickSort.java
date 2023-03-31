import java.util.LinkedList;
import Data.Nodo;

public class QuickSort {
    private LinkedList<Nodo> lista;

    public QuickSort(){ }

    public QuickSort(LinkedList<Nodo> lista) {
        this.lista = lista;
    }

    public void setLista(LinkedList<Nodo> lista) {
        this.lista = lista;
    }

    public LinkedList<Nodo> getLista() {
        return lista;
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


    /////////////// Mayor a Menor // Alfabetico Inverso /////////////////

    private void quicksortEdades_Ma(int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        //definir que hara
        Nodo pivote = lista.get(fin);
        int particion = particionarEdades_Ma(inicio, fin, pivote);
        quicksortEdades_Ma(inicio, particion - 1);
        quicksortEdades_Ma(particion + 1, fin);
    }

    private void quicksortClases_Ma(int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        //definir que hara
        Nodo pivote = lista.get(fin);
        int particion = particionarClases_Ma(inicio, fin, pivote);
        quicksortClases_Ma(inicio, particion - 1);
        quicksortClases_Ma(particion + 1, fin);
    }

    private void quicksortNombres_Ma(int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        //definir que hara
        Nodo pivote = lista.get(fin);
        int particion = particionarNombres_Ma(inicio, fin, pivote);
        quicksortNombres_Ma(inicio, particion - 1);
        quicksortNombres_Ma(particion + 1, fin);
    } 

    
    private int particionarEdades_Ma(int inicio, int fin, Nodo pivote) {
        int i = inicio;
        int j = fin;
        while (i < j) {
            while (lista.get(i).getAge() >= pivote.getAge() && i < j) {
                i++;
            }
            while (lista.get(j).getAge() < pivote.getAge() && i < j) {
                j--;
            }
            if (i < j) {
                intercambiar(i, j);
            }
        }
        if (lista.get(i).getAge() <= pivote.getAge()) {
            intercambiar(i, fin);
        } else {
            i++;
        }
        return i;
    }

    private int particionarClases_Ma(int inicio, int fin, Nodo pivote) {
        int i = inicio;
        int j = fin;
        while (i < j) {
            while (lista.get(i).getClase() >= pivote.getClase() && i < j) {
                i++;
            }
            while (lista.get(j).getClase() < pivote.getClase() && i > j) {
                j--;
            }
            if (i < j) {
                intercambiar(i, j);
            }
        }
        if (lista.get(i).getClase() <= pivote.getClase()) {
            intercambiar(i, fin);
        } else {
            i++;
        }
        return i;
    }

    private int particionarNombres_Ma(int inicio, int fin, Nodo pivote) {
        int i = inicio;
        int j = fin;
        while (i < j) {
            if (esMayor(lista.get(j), pivote)) {  // si elemento en j es mayor que el pivote
                i++;
                intercambiar(i, j);
            }
        }
        if (lista.get(i).getAge() >= pivote.getAge()) {
            intercambiar(i, fin);
        } else {
            i++;
        }
        return i;
    }

    /////////////// Menor a Mayor // Alfabetico /////////////////

    private void quicksortEdades_Me(int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        //definir que hara
        Nodo pivote = lista.get(fin);
        int particion = particionarEdades_Me(inicio, fin, pivote);
        quicksortEdades_Me(inicio, particion - 1);
        quicksortEdades_Me(particion + 1, fin);
    }

    private void quicksortClases_Me(int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        //definir que hara
        Nodo pivote = lista.get(fin);
        int particion = particionarClases_Me(inicio, fin, pivote);
        quicksortClases_Me(inicio, particion - 1);
        quicksortClases_Me(particion + 1, fin);
    }

    private void quicksortNombres_Me(int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        //definir que hara
        Nodo pivote = lista.get(fin);
        int particion = particionarNombres_Me(inicio, fin);
        quicksortNombres_Me(inicio, particion - 1);
        quicksortNombres_Me(particion + 1, fin);
    } 


    private int particionarEdades_Me(int inicio, int fin, Nodo pivote) {
        int i = inicio;
        int j = fin;
        while (i < j) {
            while (lista.get(i).getAge() < pivote.getAge() && i < j) {
                i++;
            }
            while (lista.get(j).getAge() >= pivote.getAge() && i < j) {
                j--;
            }
            if (i < j) {
                intercambiar(i, j);
            }
        }
        if (lista.get(i).getAge() >= pivote.getAge()) {
            intercambiar(i, fin);
        } else {
            i++;
        }
        return i;
    }

    private int particionarClases_Me(int inicio, int fin, Nodo pivote) {
        int i = inicio;
        int j = fin;
        while (i < j) {
            while (lista.get(i).getClase() < pivote.getClase() && i < j) {
                i++;
            }
            while (lista.get(j).getClase() >= pivote.getClase() && i < j) {
                j--;
            }
            if (i < j) {
                intercambiar(i, j);
            }
        }
        if (lista.get(i).getClase() >= pivote.getClase()) {
            intercambiar(i, fin);
        } else {
            i++;
        }
        return i;
    }

    public int particionarNombres_Me(int inicio, int fin) {
        int i = inicio;
        int j = fin;
        while (i < j) {
            if (esMayor(lista.get(j), lista.get(i))) {  // si elemento en j es mayor que el pivote
                i++;
                intercambiar(i, j);
            }
            else {
            i++;
        }
        }
        
        return i;
    }


    private void intercambiar(int i, int j) {
        Nodo temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }


    public boolean esMayor(Nodo a, Nodo b) {
        int i = 0;
        while (i < a.getNombre().length() && i < b.getNombre().length()) {
            if (a.getNombre().charAt(i) > b.getNombre().charAt(i)) {
                return false;
            } else if (a.getNombre().charAt(i) < b.getNombre().charAt(i)) {
                return true;
            }
            i++;
        }
        return a.getNombre().length() > b.getNombre().length();
    }
    
}
