package Dynamic_Array_Implementation_Of_Stack;

/**
 * Created by Tejasvi Kumar on 22-03-2017.
 */
public class DynamicArrayStack {
    protected int capacity;
    public static final int CAPACITY = 16;

    protected int[] stackArr;
    protected int top = -1;


    public DynamicArrayStack()
    {
        this(CAPACITY);
    }
    public DynamicArrayStack(int cap)
    {
        capacity = cap;
        stackArr = new int[capacity];
    }

    public void push(int data)
    {
        if(size() == capacity)
            expand();
        stackArr[++top] = data;
        System.out.println("Added Data in the Stack="+ data);
    }
    public int pop() throws Exception
    {
        if(isEmpty())
            throw new Exception("Stack is Empty");
       int data = stackArr[top];
        stackArr[top--] = Integer.MIN_VALUE;
        return data;
    }

    public int top() throws Exception
    {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        int data = stackArr[top];
        return  data;
    }

    public void expand()
    {
        int length = size();
        int[] newStackArray = new int[length<<1]; // length<<1 = length*2
        System.arraycopy(stackArr,0,newStackArray,0,length);
        stackArr = newStackArray;
        capacity = capacity << 1;                         //capacity << 1 = capacity *2
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
