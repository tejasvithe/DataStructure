package Array_Implementation_Of_Stack;

/**
 * Created by Tejasvi Kumar on 22-03-2017.
 */
public class FixedSizeArrayStack {
    public int capacity ;
    public static final int CAPACITY = 10;
    int[] stackArr ;
    int top = -1;

    public FixedSizeArrayStack()
    {
        this(CAPACITY);
    }

    public FixedSizeArrayStack(int cap)
    {
        capacity = cap;
        stackArr =new  int[capacity];
    }

    public void push(int data) throws Exception
    {
        if(size() == capacity )
        {
            throw new Exception("Stack is full");

        }
        stackArr[++top] = data;
        System.out.println("Added Element =" +data);

    }

    public int pop() throws Exception
    {
        int data;
        if(isEmpty())
            throw new Exception("Stack is Empty");
        data = stackArr[top];
        stackArr[top--] = Integer.MIN_VALUE;
        return data;
    }
    public int top() throws Exception
    {
        int data;
        if(isEmpty())
            throw new Exception("Stack is Empty");
        data = stackArr[top];
        return data;

    }

    public int size()
    {
     return top+1;
    }
    public boolean isEmpty()
    {
        return (top < 0);
    }
}

