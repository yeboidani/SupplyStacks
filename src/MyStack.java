import java.util.ArrayList;

public class MyStack<T>{
    private int maxSize;
    private int topIndex;
    private T[] Stack;

    public MyStack(int size){
        this.maxSize = size;
        topIndex = -1;

        Stack =  (T[]) new Object[size];
    }

    public MyStack(){
        this(100);
    }

    //checks if it is empty
    public boolean isEmpty(){
        return topIndex==-1;
    }

    //check if it's full
    public boolean isFull(){
        return topIndex == maxSize - 1;
    }


    //pops one from the topindex
    public T pop() throws StackUnderflowException{
        if(isEmpty())
            throw new StackUnderflowException("Stack is empty");

        T top = Stack[topIndex];
        Stack[topIndex] = null;
        topIndex--;

        return top;
    }

    //checks the top index usually called peak but for our case I called it top
    public T top() throws StackUnderflowException{
        if(isEmpty())
            throw new StackUnderflowException("Stack is empty");

        return Stack[topIndex];
    }

    //pushes it into the Stack
    public boolean push(T e) throws StackOverflowException{
        if(isFull())
            throw new StackOverflowException("Stack is full");

        topIndex++;
        Stack[topIndex] = e;

        return true;

    }


    //prints what's in the stack, not needed for this project but why not just have it lol
    public String toString(){
        String result = "";

        for(int i = 0 ; i <= topIndex; i++){
            result += Stack[i];
        }

        return result;
    }


}
