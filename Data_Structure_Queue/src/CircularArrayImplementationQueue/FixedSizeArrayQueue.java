package CircularArrayImplementationQueue;

/**
 * Created by Tejasvi Kumar on 23-03-2017.
 */
public class FixedSizeArrayQueue {

    private int capacity;
    private int size,front,rear;
    private int []  QueueArr;
    private static final int CAPACITY = 16; // Default Queue Size

    public FixedSizeArrayQueue()
    {
        capacity = CAPACITY;
        QueueArr = new int[capacity];
        size = 0;front=0;rear = 0 ;
    }

    public FixedSizeArrayQueue(int cap)
    {
        capacity = cap ;
        QueueArr = new int[capacity];
        size = 0;front =0 ;rear =0;
    }

    public void enQueue(int data) throws NullPointerException,IllegalStateException
    {
        if(size() == capacity)
        throw new IllegalStateException("Queue is Full");
        else
        {
            size++;
            QueueArr[rear] = data;
            rear = (rear+1) % capacity;
            System.out.println("Added Element = "+data);
        }

    }

    public int deQueue()throws IllegalStateException
    {
        if(isEmpty())
            throw new IllegalStateException("Queue is Empty");
        else {
            size--;
            int data = QueueArr[front];
            QueueArr[front] = Integer.MIN_VALUE;
            front = (front + 1) % capacity;
            return data;
        }
    }

    public int front() throws IllegalStateException
    {
        if(isEmpty())
            throw new  IllegalStateException("Queue is Empty");
        else
        {
            return QueueArr[front];
        }
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return (size==0);
    }

    public boolean isFull()
    {
        return (size == capacity);
    }

}
