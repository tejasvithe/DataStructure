package linkedListImplementationQueue;

/**
 * Created by Tejasvi Kumar on 23-03-2017.
 */
public class LinkedQueue {
    ListNode front ,rear;
    private int length;


    public LinkedQueue()
    {
        length = 0;
        front = rear = null;
    }

    public void enQueue(int data)
    {
        ListNode  newNode  = new ListNode(data);
        if(isEmpty())
        {
            front = rear = newNode;
        }
        rear.setNext(newNode);
        rear = newNode;
        length++;
        System.out.println("Added Element =" + data);
    }

    public int deQueue()throws Exception
    {
        if(isEmpty())
            throw new Exception("Queue is Empty");
        else
        {
            int data = front.getData();
            front = front.getNext();
            length--;
            if(isEmpty())
                rear = null;
            return data;
        }
    }

    public int first() throws  Exception
    {
        if(isEmpty())
            throw new Exception("Queue is Empty");
        else
            return front.getData();

    }

    public boolean isEmpty()
    {
        return (length == 0);
    }
    public int size()
    {
        return length;
    }
}
