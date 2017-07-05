package CircularLinkedList;

import java.util.Scanner;

/**
 * Created by Tejasvi Kumar on 02-03-2017.
 */
public class CircularLinkedListLauncher {

    public static void main(String[] args) {
        CLLNode head = null;

        CircularLinkedListUtility obj = new CircularLinkedListUtility();
        System.out.println("Number of operation your want to do");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while( input-- > 0 )
        {
            System.out.println("Press 1 for insert node at starting 2 for insert node at ending");
            System.out.println(" press 3 for delete node at the starting 4 for delete the node at ending ");
            System.out.println(" press 5 for print the size of linked list 6 for show All the node of the Circular Linked List");

            int n = scan.nextInt();

            if(n == 1)
            {
                int data = scan.nextInt();
                head = obj.insertNodeAtFront(head,data);
                System.out.println("Length->"+obj.getCircularLinkedListLength(head));
                obj.PrintCircularLinkedLIst(head);
            }
            if(n == 2)
            {
                int data = scan.nextInt();
                head = obj.insertNodeAtEnd(head,data);
                System.out.println(obj.getCircularLinkedListLength(head));
                obj.PrintCircularLinkedLIst(head);

            }
            if(n == 3)
            {
                System.out.println(" Length Before deletion"+obj.getCircularLinkedListLength(head));
                head = obj.deleteNodeAtFront(head);
                System.out.println("Length After deletion"+obj.getCircularLinkedListLength(head));
                obj.PrintCircularLinkedLIst(head);
            }
            if(n == 4)
            {
                System.out.println(" Length Before deletion"+obj.getCircularLinkedListLength(head));
                head = obj.deleteNodeAtEnd(head);
                System.out.println("Length After deletion"+obj.getCircularLinkedListLength(head));
                obj.PrintCircularLinkedLIst(head);
            }
            if(n == 5)
            {
                int n1 = obj.getCircularLinkedListLength(head);
                System.out.println(n1);
            }
            if(n == 6)
            {
                obj.PrintCircularLinkedLIst(head);
            }
        }
    }
}
