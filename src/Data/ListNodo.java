package Data;

import java.awt.List;

public class ListNodo {
    private Nodo first;
    private Nodo last;
    
    public ListNodo(){
        first = null; 
        last = null;
    }

    public boolean isEmpty() { 
        return first==null; 
    }
    
    public void insertFirst(Nodo newNodo){
        if( isEmpty() ) 
            last = newNodo; 
        else
            first.previous = newNodo;
        newNodo.next = first;
        first = newNodo;
    }

    public void insertLast(Nodo newNodo) {
        if( isEmpty() ) 
            first = newNodo; 
        else {
            last.next = newNodo; 
            newNodo.previous = last; 
        }
        last = newNodo; 
    }

    public Nodo deleteFirst() { 
        Nodo temp = first;
        if(first.next == null) 
            last = null;
        else
            first.next.previous = null;
        first = first.next; 
        return temp;
    }

    public Nodo deleteLast(){
        Nodo temp = last;
        if(first.next == null) 
            first = null; 
        else
            last.previous.next = null; 
        last = last.previous; 
        return temp;
    }

    public Nodo peekFirst() { 
        return first;
    }

    public Nodo peekLast(){
        Nodo current = first;
        while(current.next != null) {
            current = current.next; 
        }
        return current;
    }

    public void display() {
        Nodo current = first;
        while(current != null) {
            current.display(); 
            current = current.next;
        }
        System.out.println("");
    }

    public void displaya() {
        Nodo current = first;
        while(current != null) {
            current.displaya(); 
            current = current.next;
        }
        System.out.println("");
    }

    public int lenght(){
        int c=0;
        Nodo current = first;
        while(current!= null){
            for( c = 0; current!=null;c++){
               current = current.next;
            }
        }
            return c;
    }
    //getters de cada elemento que contiene un nodo
    public int[] getAges(){
        Nodo current = first;
        ListNodo list = new ListNodo();
        int[] edades = new int[list.lenght()];
        
        while(current != null){
            for(int i=0; current !=null; i++){      //recorremos la lista en busca de todas la edades
                edades[i] = current.getAge();          //las metemos a un arreglo
                current = current.next;             
            }     
            
        }
        return edades;     //se debe hacer una funcion similar para cada tipo de dato que almacena de dataset
                        //ya que debemos ser capaces de ordenar segun el algoritmo cualquera de las columnas de datos

    }
    public int[] getPassengerId(){
        Nodo current = first;
        ListNodo list = new ListNodo();
        int[] passengerIds = new int[list.lenght()];

        while(current!= null){
            for(int i=0; current != null; i++){
                passengerIds[i] = current.getPassengerId();
                current = current.next;
            }
        }
        return passengerIds;
    }
    public int[] getSurviveState(){
        Nodo current = first;
        ListNodo list = new ListNodo();
        int[] survived = new int[list.lenght()];

        while(current!= null){
            for(int i=0; current != null; i++){
                survived[i] = current.getSurvive();
                current = current.next;
            }
        }
        return survived;
    }
    public int[] getClase(){
        Nodo current = first;
        ListNodo list = new ListNodo();
        int[] pclase = new int[list.lenght()];

        while(current!= null){
            for(int i=0; current != null; i++){
                pclase[i] = current.getClase();
                current = current.next;
            }
        }
        return pclase;
    }
    public String[] getName(){
        Nodo current = first;
        ListNodo list = new ListNodo();
        String[] name = new String[list.lenght()];

        while(current!= null){
            for(int i=0; current != null; i++){
                name[i] = current.getNombre();
                current = current.next;
            }
        }
        return name;
    }
    public String[] getSex(){
        Nodo current = first;
        ListNodo list = new ListNodo();
        String[] sex = new String[list.lenght()];

        while(current!= null){
            for(int i=0; current != null; i++){
                sex[i] = current.getSex();
                current = current.next;
            }
        }
        return sex;
    }
    public double[] getFare(){
        Nodo current = first;
        ListNodo list = new ListNodo();
        double[] fare = new double[list.lenght()];

        while(current!= null){
            for(int i=0; current != null; i++){
                fare[i] = current.getFare();
                current = current.next;
            }
        }
        return fare;
    }
}