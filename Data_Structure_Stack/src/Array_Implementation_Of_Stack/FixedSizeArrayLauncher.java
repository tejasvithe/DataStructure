package Array_Implementation_Of_Stack;

import java.util.Scanner;

/**
 * Created by Tejasvi Kumar on 22-03-2017.
 */
public class FixedSizeArrayLauncher {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        FixedSizeArrayStack obj = new FixedSizeArrayStack(capacity);
        System.out.println(obj.size());
            obj.push(10);
        System.out.println(obj.size());
            obj.push(11);
        System.out.println( obj.size());
            obj.push(12);
        System.out.println(obj.size());
            obj.push(14);
        System.out.println(obj.size());
            obj.push(15);
        System.out.println(obj.size());
            obj.push(16);
        System.out.println(obj.size());
            obj.push(17);
        System.out.println(obj.size());
            obj.push(18);
        System.out.println(obj.size());

        System.out.println("Top element of stack");

        System.out.println(obj.top());

        System.out.println("Pop result");
        System.out.println(obj.pop());

        System.out.println(obj.size());
        System.out.println(obj.pop());
        System.out.println(obj.pop());






    }
}
