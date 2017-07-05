package linkedListImplementationQueue;

/**
 * Created by Tejasvi Kumar on 23-03-2017.
 */
public class LInkedQueueLauncher {
    public static void main(String ... k) throws Exception
    {
        LinkedQueue obj = new LinkedQueue();


        for(int i =1 ;i<=10;i++) {
            obj.enQueue(i);
            System.out.println("Size = "+ obj.size());
        }

        for(int i =1 ;i<=10 ;i++) {
            System.out.println("Deteted Element=" + obj.deQueue());
            //System.out.println("Front Element = " + obj.first());
        }
        for(int i =1 ;i<=10;i++) {
            obj.enQueue(i+10);
            System.out.println("Size = "+ obj.size());
        }

    }
}
