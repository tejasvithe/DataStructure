package SinglyLinkedList;

import XorLinkedList.ListNode;

/**
 * Created by Tejasvi Kumar on 23-02-2017.
 */
public class SinglyLinkedList {


    public Node AddNodeAtFirst(Node head,int data)
    {
        Node current= head;
        Node temp = new Node(data);

        if(current == null)
        {
            head = temp;
        }
        else
        {
            temp.setNext(head);
            head = temp;
        }

        return head;
    }
    public Node AddNodeAtLast(Node head,int data)
    {
        Node current = head;
        Node temp = new Node(data);
        if(current == null)
        {
            head = temp ;
        }
        else
        {
            while(current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(temp);
        }

        return head;
    }
    public Node AddNodeAtAnyPosition(Node head,int data , int position)
    {
        Node current = head;
        Node temp = new Node(data);
        int n = getLinkedListSize(head);
        if(n < position)
        {
            System.out.println("please provide correct position , Adding the node at given position is not possible");
        }
        else
        if(position == 1 )
        {
            temp.setNext(head);
            head = temp;
        }
        else
        if(n == position)
        {
             current = AddNodeAtLast(head,data);
        }
        else
        {
            Node current1 = head;
            current1 = current1.getNext();
            for(int i = 1; i < position-1 ;i++)
            {
                current = current.getNext();
                current1 = current1.getNext();
            }
            current.setNext(temp);
            temp.setNext(current1);
        }
     return head;
    }

    public Node deleteNodeAtFirst(Node head)
    {
        Node current = head ;
        if(current == null)
        {
            System.out.println("Linked List is Empty");
        }
        else
            if(current.getNext() == null)
            {
                head = null;

            }
        else
        {
            head = head.getNext();
            current.setNext(null);
            System.out.println(current.getData());
        }

        return head;
    }
    public Node deleteNodeAtLast(Node head)
    {
        Node current  = head;
        if(current == null)
        {
            System.out.println("Linked List is Empty");
        }
        else
        if(current.getNext() == null)
        {
            System.out.println(head.getData());
            head = null;
        }
        else {
          while(current.getNext().getNext() != null)
          {
                current = current.getNext();
            }
            System.out.println(current.getData());
        current.setNext(null);
        }
        return head;
    }

    public Node deleteNodeAtIntermediate(Node head,int position)
    {
        Node current = head;
        if(current == null)
        {
            System.out.println("Linked List is Empty");
        }

        else {
            int n = getLinkedListSize(head);
            if (n < position)
            {
                System.out.println("Deletion of that particular node is not possible because given position is less than the linked list size ");
            }
            else
                if(n == position)
                {
                    head = deleteNodeAtLast(head);
                }
            else
            {
                Node temp = head;

                temp = temp.getNext().getNext();

                for (int i = 1; i < position - 1; i++) {
                    current = current.getNext();
                    temp = temp.getNext();
                }
                current.getNext().setNext(null);
                current.setNext(temp);


            }


        }
        return head;
    }
    public int getLinkedListSize(Node head)
    {
        int count=0;
        Node current = head;
        while(current != null)
        {
            count++;
            current = current.getNext();

        }

        return count;
    }

    public void showLinkedListNode(Node head)
    {
        Node current = head;
        if(current == null)
        {
            System.out.println("Linked List is Empty");
        }
        else {
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
        }
    }

    public Node exchangeAdjacentNodes(Node head)
    {
        Node temp= new Node(0);
        temp.next = head;
        Node curr = head;
        Node prev = temp;

        while(curr != null && curr.next != null)
        {
            temp = curr.next.next;
            curr.next.next = prev.next;
            prev.next = curr.next;
            curr.next = temp;
            prev= curr;
            curr = prev.next;

        }
        return head;
    }

}
