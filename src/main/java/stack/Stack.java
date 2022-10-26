package Stack;

public class Stack {
    private int [] values;
    private int currentSize;

    public Stack(int size)  {
        if(size > 0)  {
            this.values = new int[size];
        } else {
            System.out.println("Number must be greater than 0");
        }
    }
    public void push(int value)  {
        if(currentSize == values.length)  {
            throw new StackFullException("Stack is full");
        } else  {
            this.values[currentSize++] = value;
        }
    }
    public int pop() {
        if(currentSize == 0)  {
            throw new StackEmptyException("Stack is empty");
        }
        return values[--currentSize];
    }
    public int top()  {
        if(currentSize == 0)  {
            throw new StackEmptyException("Stack is full");
        }
        --currentSize;
        return values[currentSize++];
    }
    public int size(){
        return currentSize;
    }
    public void clear()  {
        currentSize = 0;
    }
}