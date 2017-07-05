package LinkedList_Implementation_Of_Stack;

/**
 * Created by Tejasvi Kumar on 22-03-2017.
 */
public class ListNode {
    int data ;
    ListNode next ;

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
    public ListNode  getNext()
    {
        return this.next;
    }
    public void setNext(ListNode next)
    {
        this.next = next;
    }
}
