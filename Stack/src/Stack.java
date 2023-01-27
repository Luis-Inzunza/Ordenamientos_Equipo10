class Stack {
    private Value value;
    private int maxSize;
    private int top;
    private Value<Integer> stackArray = new Value<Integer>(5);
     
    public Stack(int s) {
        value = new Value<Integer>(s);
        maxSize = s;
        stackArray = value.getValue()[maxSize];
        top = -1;
    }

    public void push(long j) throws StackException {
        if ( isFull() ) {
   	        throw new StackException("Stack overflow");
   	    }
        stackArray[++top] = j;
    }
    
    public long pop() throws StackException {
        long item;
        if (isEmpty()){
            throw new StackException("Stack underflow");
        }
        item = stackArray[top--];
        return item;
    }
     
    public long peek() {
        return stackArray[top]; 
    }
    
    public boolean isEmpty() {
        return (top == -1); 
    }
     
    public boolean isFull() {
        return (top == maxSize-1); 
    }
}

