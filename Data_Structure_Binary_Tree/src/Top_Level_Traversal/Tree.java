package Top_Level_Traversal;

/**
 * Created by Tejasvi Kumar on 29-05-2017.
 */
import java.util.*;
public class Tree {
        public void printTopView(TreeNode root)
        {
            if (root == null)
            {
                return;
            }

            HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
            Queue<QItem> Q = new LinkedList<QItem>();

            Q.add(new QItem(root, 0));

            while (!Q.isEmpty())
            {
                QItem qi = Q.remove();
                int hd = qi.hd;
                TreeNode n = qi.node;

                if (!set.containsKey(hd))
                {
                    set.put(hd,n.key);
                }

                if (n.left != null)
                    Q.add(new QItem(n.left, hd-1));
                if (n.right != null)
                    Q.add(new QItem(n.right, hd+1));
            }
            for(Map.Entry m :set.entrySet())
            System.out.print(m.getValue()+" ");

        }
    }


