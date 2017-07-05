package Level_Order_Traversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Tejasvi Kumar on 29-05-2017.
 */
public class BinaryTreeUtilitty {

    public void printTopView(BinaryNode root)
    {
        if(root == null)
            return;

        Queue<BinaryNode> q = new LinkedList<>() ;

        if(q.isEmpty())
        {
            q.add(root);
        }

        while(!q.isEmpty())
        {
           BinaryNode n =  q.remove();
            System.out.print(n.getData()+" ");
            if(n.getLeft() != null)
                q.add(n.getLeft());
            if(n.getRight() != null)
                q.add(n.getRight());

        }

    }
}
