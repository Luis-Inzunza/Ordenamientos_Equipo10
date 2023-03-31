public class Main {
    public static void main(String[] args) {
        // Crear objeto BinaryInsertionSortNombre_Ma
        BinaryInsertionSort sorter = new BinaryInsertionSort();

        // Agregar objetos Nodo a la lista
        sorter.getLista().add(new Nodo("Juan", 25, "A"));
        sorter.getLista().add(new Nodo("Maria", 30, "B"));
        sorter.getLista().add(new Nodo("Pedro", 20, "A"));
        sorter.getLista().add(new Nodo("Ana", 27, "C"));
        sorter.getLista().add(new Nodo("Luis", 22, "B"));
        sorter.getLista().add("juan");

        // Ordenar la lista por nombre de manera ascendente
        sorter.sort(3, false);

        // Imprimir la lista ordenada
        for (Nodo nodo : sorter.getLista()) {
            System.out.println(nodo.getNombre() + " " + nodo.getAge() + " " + nodo.getClase());
        }
    }
}