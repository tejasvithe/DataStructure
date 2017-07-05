package SinglyLinkedList;

import java.util.Scanner;

/**
 * Created by Tejasvi Kumar on 25-02-2017.
 */
public class SinglyLinkedListLauncher {
    public static void main(String[] args) {
        //Node head = null;
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(3);



        SinglyLinkedList obj = new SinglyLinkedList();
        obj.showLinkedListNode(head);
        System.out.println();
        obj.exchangeAdjacentNodes(head);
        obj.showLinkedListNode(head);

        System.out.println("Number of node you want to Add");

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();


        while (n1-- > 0) {
            System.out.println("Give the position where you want to add the node 1 for at starting, 2 for atv Last, 3 for at given position and 4 for show the node of linked List ");
            System.out.println("For Deletion Tpye 5 for delete the node at starting 6 for delete the node at last 7 for delete the node at intermediate");
            int n = scan.nextInt();
            if (n == 1) {
                int input = scan.nextInt();
                head = obj.AddNodeAtFirst(head, input);
                obj.showLinkedListNode(head);
                System.out.println("Size =" + obj.getLinkedListSize(head));
            }
            if (n == 2) {
                int input = scan.nextInt();
                head = obj.AddNodeAtLast(head, input);
                obj.showLinkedListNode(head);
                System.out.println("Size =" + obj.getLinkedListSize(head));
            }

            if (n == 3) {
                int input = scan.nextInt();
                int position = scan.nextInt();
                head = obj.AddNodeAtAnyPosition(head, input, position);
                obj.showLinkedListNode(head);
                System.out.println("Size =" + obj.getLinkedListSize(head));
            }
            if (n == 4) {
                obj.showLinkedListNode(head);
            }
            if(n == 5 )
            {
                head = obj.deleteNodeAtFirst(head);
                obj.showLinkedListNode(head);
                System.out.println("Size =" + obj.getLinkedListSize(head));
            }
            if(n == 6 )
            {
               head = obj.deleteNodeAtLast(head);
                obj.showLinkedListNode(head);
                System.out.println("Size =" + obj.getLinkedListSize(head));
            }
            if(n == 7)
            {
                int position = scan.nextInt();
                head = obj.deleteNodeAtIntermediate(head,position);
                obj.showLinkedListNode(head);
                System.out.println("Size =" + obj.getLinkedListSize(head));
            }
        }
    }
}
