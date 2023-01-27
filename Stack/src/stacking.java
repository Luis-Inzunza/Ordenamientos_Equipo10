import java.lang.reflect.Array;

public class stacking {
    private int size;
    private float arry[10];
    private int top;

    public stacking(){
        top = -1;

    }

    public void push(stacking x, float y){
        if(x.isFull()){
            System.out.println("No cabe mas, ta lleno");
        }else{
            size = size +1;
            arry[size] = y;

        }
    }

    public float pop(){

    }

    public float peek(){
        return arry[10];
    }

    public boolean isEmpty(){

    }

    public boolean isFull(){
        if (size == top+1){
            return true;
        }
        else{
            return false;
        }
    }

    public void dar(){

    }

}
