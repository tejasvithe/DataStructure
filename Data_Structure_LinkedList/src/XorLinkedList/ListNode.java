package XorLinkedList;

/**
 * Created by Tejasvi Kumar on 03-04-2017.
 */
public class ListNode {
    int data;
    ListNode next;
    public ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }
    public ListNode(int data , ListNode next)
    {
        this.data = data;
        this.next = next;
    }

    int getData()

    {
        return this.data;
    }
    void setData(int data)
    {
        this.data = data;
    }
    ListNode getNext()
    {
        return this.next;
    }
    void setNext(ListNode next)
    {
        this.next= next;
    }
}
