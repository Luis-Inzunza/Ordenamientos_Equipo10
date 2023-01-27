public class Value<T> {

  private T t;

  public Value(T s){
    this.t = s;
  }
  
  public T get() { return t; }
    
  public void set(T t) { this.t = t; }
}
