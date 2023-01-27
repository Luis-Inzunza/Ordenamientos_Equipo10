class StackApp {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        try{
            myStack.push(20);
            System.out.print("push: " + myStack.peek() + " ");
            myStack.push(40);
            System.out.print("push: " + myStack.peek() + " "); 
            myStack.push(60);
            System.out.print("push: " + myStack.peek() + " "); 
            myStack.push(80);
            System.out.print("push: " + myStack.peek() + " "); 
            myStack.push(100);
            System.out.print("push: " + myStack.peek() + " "); 
            System.out.println();
            System.out.print("pop: " + myStack.pop() + " ");
            System.out.print("pop: " + myStack.pop() + " ");
            System.out.print("pop: " + myStack.pop() + " ");
            System.out.print("pop: " + myStack.pop() + " ");
            System.out.print("pop: " + myStack.pop() + " ");
        }
        catch (StackException e){
            System.out.println("Error: " + e.getMessage() );
            System.exit(1);
        }
    }
}