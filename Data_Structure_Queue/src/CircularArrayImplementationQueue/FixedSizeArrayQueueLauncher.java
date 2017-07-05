package CircularArrayImplementationQueue;

/**
 * Created by Tejasvi Kumar on 23-03-2017.
 */
public class FixedSizeArrayQueueLauncher {

    public static void main(String ... k)throws IllegalStateException
    {
        FixedSizeArrayQueue obj = new FixedSizeArrayQueue(20);

        obj.enQueue(1);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(2);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(3);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(4);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(5);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(6);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(7);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(8);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(9);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());
        obj.enQueue(10);
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Size = "+obj.size());


        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Deleted Element"+obj.deQueue());
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element of Queue=" + obj.front());
        System.out.println("Deleted Element="+obj.deQueue());
        System.out.println("Front Element of Queue=" + obj.front());






    }
}
