package DoublyLinkedLIst;


import java.util.Scanner;

/**
 * Created by Tejasvi Kumar on 01-03-2017.
 */
public class DoublyLinkedListLauncher {
    public static void main(String[] args) {

        DNode  head = null;
        DoublyLinkedListUtility obj = new DoublyLinkedListUtility() ;
        System.out.println("Number of operation your want to do");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while( input-- > 0 )
        {
            System.out.println("Press 1 for Add node at starting 2 for Add node at Ending and 3 for Add node at Intermediate ");
            System.out.println("Press 4 for Delete node at starting 5 for Delete node at Ending 6 for delete node at Intermediate");
            System.out.println("Press 7 for calculate the size of Linked List and 8 for show the whole data of Linked List");
            int n = scan.nextInt();
            if(n == 1)
            {
                int data = scan.nextInt();
                System.out.println("Before Insertion size: " +obj.getSizeOfDoublyLinkedLIst(head));
                head = obj.addNodeAtFirs(head,data);
                System.out.println("After Insertion size: " +obj.getSizeOfDoublyLinkedLIst(head));
            }
            if(n ==2)
            {

                int data = scan.nextInt();
                System.out.println("Before Insertion size: " +obj.getSizeOfDoublyLinkedLIst(head));
                head = obj.addNodeAtLast(head,data);
                System.out.println("After Insertion size: " +obj.getSizeOfDoublyLinkedLIst(head));
            }
            if(n == 3)
            {
                int data = scan.nextInt();
                int position = scan.nextInt();
                System.out.println("Before Insertion size: " +obj.getSizeOfDoublyLinkedLIst(head));
                head = obj.addNodeAtIntermediate(head,data,position);
                System.out.println("After Insertion size: " +obj.getSizeOfDoublyLinkedLIst(head));
            }
            if(n == 4)
            {
                System.out.println("Before Deletion size: " +obj.getSizeOfDoublyLinkedLIst(head));
                head = obj.deleteNodeAtFirst(head);
                System.out.println("After Deletion size: "+ obj.getSizeOfDoublyLinkedLIst(head));
            }
            if(n == 5)
            {
                System.out.println("Before Deletion size: " +obj.getSizeOfDoublyLinkedLIst(head));
                head = obj.deleteNodeAtLast(head);
                System.out.println("After Deletion size: "+ obj.getSizeOfDoublyLinkedLIst(head));
            }
            if(n == 6)
            {
                int position = scan.nextInt();
                System.out.println("Before Deletion size: " +obj.getSizeOfDoublyLinkedLIst(head));
                head = obj.deleteNodeAtIntermediate(head,position);
                System.out.println("After Deletion size: "+ obj.getSizeOfDoublyLinkedLIst(head));
            }
            if(n == 7)
            {
                int size = obj.getSizeOfDoublyLinkedLIst(head);
                System.out.println("Size of Linked LIst is : " + size );
            }
            if(n == 8)
            {
               obj.TraverseDoublyLinkedList(head);
            }
        }



    }
}
