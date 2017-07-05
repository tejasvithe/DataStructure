package DoublyLinkedLIst;

import java.awt.dnd.DnDConstants;

/**
 * Created by Tejasvi Kumar on 01-03-2017.
 */
public class DNode {

    private int data;
    private DNode prev;
    private DNode next;

    public DNode(int data)
    {
        this.data = data;
        next = null;
        prev = null;

    }
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return data;
    }
    public void setPrev(DNode prev)
    {
        this.prev = prev;
    }

    public DNode  getPrev()
    {
        return prev;
    }
    public void setNext(DNode next)
    {
        this.next = next;
    }

    public DNode getNext()
    {
        return next;
    }
}
