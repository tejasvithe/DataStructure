package LinkedList_Implementation_Of_Stack;

import java.util.EmptyStackException;

/**
 * Created by Tejasvi Kumar on 22-03-2017.
 */
public class LinkeListStackLauncher {
    public static void main(String[] args)throws EmptyStackException {

        LinkedListStack obj = new LinkedListStack();
        System.out.println("Push Operation");
        obj.push(1);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(2);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(3);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(4);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(5);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(6);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(7);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(8);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(9);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());
        obj.push(10);
        System.out.println("Peek Element = "+obj.peek());
        System.out.println("Size = " +obj.size());


        System.out.println("Pop Operation");
        System.out.println("Deleted Element=" + obj.pop());

        System.out.println("Deleted Element=" + obj.pop());

        System.out.println("Deleted Element=" + obj.pop());

        System.out.println("Deleted Element=" + obj.pop());


    }
}
