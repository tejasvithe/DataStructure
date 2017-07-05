package CircularLinkedList;

/**
 * Created by Tejasvi Kumar on 02-03-2017.
 */
public class CLLNode {

    private int data;
    private CLLNode next;

    public CLLNode(int data)
    {
        this.data = data;
        next = null;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return data;
    }

    public void setNext(CLLNode next)
    {
        this.next = next;
    }
    public CLLNode getNext()
    {
        return next;
    }

}
