package SinglyLinkedList;

/**
 * Created by Tejasvi Kumar on 23-02-2017.
 */
public class Node {
    Node next;
    int data;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    public Node(int data , Node next)
    {
        this.data = data;
        this.next = next;
    }

    public int getData()

    {
        return this.data;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public Node getNext()
    {
        return this.next;
    }
    public void setNext(Node next)
    {
        this.next= next;
    }
}
