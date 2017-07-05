package linkedListImplementationQueue;

/**
 * Created by Tejasvi Kumar on 23-03-2017.
 */
public class ListNode {

   public  int data ;
    public ListNode next ;

    public ListNode(int data)
    {
        this.data = data;
        next = null;
    }

    public int getData()
    {
        return this.data;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public ListNode getNext()
    {
        return this.next;
    }
    public void setNext(ListNode next)
    {
        this.next = next;
    }

}
