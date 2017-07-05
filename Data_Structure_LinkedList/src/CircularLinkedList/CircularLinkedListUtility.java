package CircularLinkedList;

/**
 * Created by Tejasvi Kumar on 02-03-2017.
 */
public class CircularLinkedListUtility {

    public int getCircularLinkedListLength(CLLNode head)
    {
        int count =0;
        CLLNode currentNode = head;
        while(currentNode != head)
        {
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    public void PrintCircularLinkedLIst(CLLNode head)
    {
        CLLNode currentNode = head;

        while(currentNode.getNext() != head)
        {
            System.out.print(currentNode.getData() +" ->");
            currentNode = currentNode.getNext();
        }
        System.out.println( currentNode.getData());

    }

    public CLLNode insertNodeAtFront(CLLNode head,int data)
    {
        CLLNode currentNode = head;
        CLLNode newNode = new CLLNode(data);
        newNode.setNext(newNode);

        if(currentNode == null)
        {
            head = newNode;
        }
        else
        {
            while (currentNode.getNext() != head) {
                currentNode = currentNode.getNext();
            }

            newNode.setNext(head);
            currentNode.setNext(newNode);
            head = newNode;
        }
        return head;
    }

    public CLLNode insertNodeAtEnd(CLLNode head , int data)
    {
        CLLNode currentNode = head;
        CLLNode newNode = new CLLNode(data);
        newNode.setNext(newNode);

        if(currentNode == null)
        {
            head = newNode;
        }
        else
        {
            while(currentNode.getNext() != head)
            {
                currentNode= currentNode.getNext();
            }
            newNode.setNext(head);
            currentNode.setNext(newNode);


        }
        return head;
    }

    public CLLNode deleteNodeAtFront(CLLNode head)
    {

        CLLNode currentNode = head;
        CLLNode tempNode = head;
        if (currentNode == null)
        {
            System.out.println("The Circular Linked List Is Empty");
        }
        else
        {
            while(currentNode.getNext() != head)
            {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(tempNode.getNext());
            tempNode.setNext(null);
            head = currentNode.getNext();
        }
        return head;
    }

    public CLLNode deleteNodeAtEnd(CLLNode head)
    {
        CLLNode currentNode = head;
        CLLNode tempNode = head.getNext();

        if (currentNode == null)
        {
            System.out.println("The Circular Linked List Is Empty");
        }
        else
        {
            while(tempNode.getNext() != head)
            {
                tempNode = tempNode.getNext();
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(tempNode.getNext());
            tempNode.setNext(null);
        }

        return head;
    }

}
