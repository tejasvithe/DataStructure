package dynamicCircularArrayImplementationQueue;

/**
 * Created by Tejasvi Kumar on 23-03-2017.
 */
public class DynamicArrayQueueLauncher {

    public static void main(String ... k)
    {
        DyanamicArrayQueue obj = new DyanamicArrayQueue();

        obj.enQueue(1);
        System.out.println("Front Element = " + obj.front());
        System.out.println("Size of Queue = " +obj.size());
        obj.enQueue(2);
        System.out.println("Size of Queue = " +obj.size());
        /*obj.enQueue(3);
        System.out.println("Size of Queue = " +obj.size());
        obj.enQueue(4);
        System.out.println("Size of Queue = " +obj.size());
        obj.enQueue(5);
        System.out.println("Size of Queue = " +obj.size());
        obj.enQueue(6);
        System.out.println("Size of Queue = " +obj.size());
        obj.enQueue(7);
        System.out.println("Size of Queue = " +obj.size());
        obj.enQueue(8);
        System.out.println("Size of Queue = " +obj.size());
        obj.enQueue(9);
        System.out.println("Size of Queue = " +obj.size());
        obj.enQueue(10);
        System.out.println("Size of Queue = " +obj.size());*/

        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element = " + obj.front());

        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element = " + obj.front());
/*
        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element = " + obj.front());

        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element = " + obj.front());*/



    }
}
