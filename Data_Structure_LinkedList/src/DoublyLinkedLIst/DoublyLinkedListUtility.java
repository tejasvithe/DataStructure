package DoublyLinkedLIst;

/**
 * Created by Tejasvi Kumar on 01-03-2017.
 */
public class DoublyLinkedListUtility {

    public DNode addNodeAtFirs(DNode head,int data)
    {
        DNode current = head;
        DNode node = new DNode(data);
        if(current == null)
        {
            head = node;
        }
        else
        {
            current.setPrev(node);
            node.setNext(head);
            head = node;
        }
      return head;
    }
    public DNode addNodeAtLast(DNode head,int data)
    {
        DNode current = head;
        DNode node = new DNode(data);
        if(current == null)
        {
            head = node;
        }
        else
        {
            while(current.getNext() != null)
                current = current.getNext();

            current.setNext(node);
            node.setPrev(current);

        }
        return head;
    }
    public DNode addNodeAtIntermediate(DNode head,int data,int position)
    {
        DNode current = head;
        DNode node = new DNode(data);
        int n = getSizeOfDoublyLinkedLIst(head);
        if(n < position)
        {
            System.out.println("Insertion Of Node is not possible at this specific Location");
        }
        else
        if(n== position)
        {
            head = addNodeAtLast(head,data);
        }
        else
        {
            DNode temp = head;
            temp = temp.getNext();
                    for(int i =1 ; i< position-1 ;i++)
                    {
                        current = current.getNext();
                        temp = temp.getNext();
                    }
            temp.setPrev(node);
            current.setNext(node);
            node.setPrev(current);
            node.setNext(temp);
        }
        return head;
    }

    public DNode deleteNodeAtFirst(DNode head)
    {
        DNode current = head;
        if(current == null)
        {
            System.out.println("Doubly Linked List is already Empty");
        }
        if(current.getNext() == null)
        {
            head = null;
        }
        else
        {
            head= head.getNext();
            current.setNext(null);
            head.setPrev(null);
            System.out.println(current.getData());
        }

        return head;
    }
    public DNode deleteNodeAtLast(DNode head)
    {
        DNode current = head;
        if(current == null)
        {
            System.out.println("Doubly Linked List is already Empty");
        }
        if(current.getNext() == null)
        {
            head = null;
        }
        else
        {
            while(current.getNext().getNext() !=null)
            {
                current = current.getNext();
            }
            current.getNext().setPrev(null);
            System.out.println(current.getNext().getData());
            current.setNext(null);
        }
        return head;
    }
    public DNode deleteNodeAtIntermediate(DNode head,int position)
    {
        DNode current = head;
        int n = getSizeOfDoublyLinkedLIst(head);
        if(n < position)
        {
            System.out.println("Deletion of This Doubly Linked List is not possible");
        }
        else
        if(n== position)
        {
         head = deleteNodeAtLast(head);
        }
        else {
            DNode temp = head;
            temp = temp.getNext().getNext();
            for(int i = 1 ; i < position -1 ; i++)
            {
                current = current.getNext();
                temp = temp .getNext();
            }
            temp.getPrev().setNext(null);
            temp.getPrev().setPrev(null);
            System.out.println(temp.getPrev().getData());
            temp.setPrev(current);
            current.setNext(temp);

        }
        return head ;
    }


    public int getSizeOfDoublyLinkedLIst(DNode head)
    {
        int count=0;
        DNode current = head;
        while(current != null)
        {
            count++;
            current= current.getNext();
        }
        return count;
    }

    public void TraverseDoublyLinkedList(DNode head)
    {
        DNode current = head ;
        if(current == null)
        {
            System.out.println("DoublyLinked List is Empty");
        }
        else {

            while (current != null) {
                System.out.println(current.getData() + " ");
                current = current.getNext();
            }
        }
    }

}
