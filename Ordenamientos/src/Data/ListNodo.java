package Data;

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

}