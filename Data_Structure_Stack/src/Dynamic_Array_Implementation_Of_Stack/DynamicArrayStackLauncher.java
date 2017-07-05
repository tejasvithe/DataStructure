package Dynamic_Array_Implementation_Of_Stack;

import java.util.Scanner;

/**
 * Created by Tejasvi Kumar on 22-03-2017.
 */
public class DynamicArrayStackLauncher {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int intial_Capacity = scan.nextInt();
        DynamicArrayStack obj = new DynamicArrayStack(intial_Capacity);

        obj.push(1);
        System.out.println("Top Element="+obj.top());
        obj.push(2);
        System.out.println("Top Element="+obj.top());

        obj.push(3);
        System.out.println("Top Element="+obj.top());

        obj.push(4);
        System.out.println("Top Element="+obj.top());

        obj.push(5);
        System.out.println("Top Element="+obj.top());

        obj.push(6);
        System.out.println("Top Element="+obj.top());

        obj.push(7);
        System.out.println("Top Element="+obj.top());

        obj.push(8);
        System.out.println("Top Element="+obj.top());

        obj.push(9);
        System.out.println("Top Element="+obj.top());

        obj.push(10);
        System.out.println("Top Element="+obj.top());

        obj.pop();
        System.out.println("Top Element="+obj.top());
        obj.pop();
        System.out.println("Top Element="+obj.top());
        obj.pop();
        System.out.println("Top Element="+obj.top());
        obj.pop();
        System.out.println("Top Element="+obj.top());
        obj.pop();
        System.out.println("Top Element="+obj.top());








    }
}
