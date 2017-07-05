package dynamicCircularArrayImplementationQueue;

/**
 * Created by Tejasvi Kumar on 23-03-2017.
 */
public class DyanamicArrayQueue {

    private int capacity ;
    private int []  QueueArr ;
    private  int size , front,rear;
    private static  final int CAPACITY = 16;
    private  static final int MINCAPACITY = 1<<15;

    public DyanamicArrayQueue()
    {

        capacity = CAPACITY;
        QueueArr =new int [capacity];
        size =0 ;front =0 ;rear =0;
    }

    public DyanamicArrayQueue(int cap)
    {
        capacity = cap;
        QueueArr = new int [capacity];
        size =0 ;front = 0 ;rear =0;
    }

    public void enQueue(int data) throws NullPointerException,IllegalStateException
    {
        if(size == capacity)
            expand();
            size ++;
            QueueArr[rear] = data;
            rear = (rear+1) % capacity;
            System.out.println("Added Element="+data);

    }
    public int deQueue() throws  IllegalStateException
    {
        if(isEmpty())
            throw new IllegalStateException("Queue is Empty");
        else
        {
            size -- ;
            int data = QueueArr[front];
            front = (front+1) % capacity;
            shrink();
            return data;
        }

    }

    public int front() throws IllegalStateException
    {
        if(isEmpty())
            throw new IllegalStateException("Queue is Empty");
            else
        {
            return QueueArr[front];
        }
    }

    public void expand()
    {
        int length = size();
        int [] newArray = new int [length<<1];
        for(int i = front ;i <= rear ; i++)
        {
            newArray[i-front] = QueueArr[i%capacity];
        }
        QueueArr = newArray;
        front = 0;
        rear = length - 1;
        capacity = capacity * 2;
    }

    public void shrink()
    {
        int length = size();
        if(length<< 2 >= capacity || length <= MINCAPACITY)
            return;
        if(length < MINCAPACITY)
            length = MINCAPACITY;
        int[] newArray = new int [length];
        System.arraycopy(QueueArr,0,newArray,0,length+1);
        QueueArr = newArray;
    }

    public int size()
    {
        return size;
    }


    public boolean isEmpty()
    {
        return (size == 0);
    }

    public boolean isFull()
    {
        return (size == capacity);
    }

}
