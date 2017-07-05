package LinkedList_Implementation_Of_Stack;

import java.util.EmptyStackException;

/**
 * Created by Tejasvi Kumar on 22-03-2017.
 */
public class LinkedListStack {
    private int length ;
    private ListNode top ;

    public LinkedListStack()
    {
        length = 0;
        top = null;

    }

    public void push(int data)
    {
        ListNode newNode = new ListNode(data);

        newNode.setNext(top);
        top = newNode;
        length++;
    }

    public int pop() throws EmptyStackException
    {
        if(isEmpty())
            throw new EmptyStackException();
        int data = top.getData();
        top = top.getNext();
        return data;
    }

    public int peek() throws EmptyStackException
    {
        if(isEmpty())
            throw new EmptyStackException();
        return top.getData();
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
