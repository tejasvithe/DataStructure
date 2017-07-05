package Botton_Level_Traversal;


import java.util.*;

/**
 * Created by Tejasvi Kumar on 29-05-2017.
 */
public class Tree {


    public void printBottomView(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        HashMap<Integer,Integer> set = new HashMap<>();

        Queue<QItem> Q = new LinkedList<>();

        Q.add(new QItem(root, 0));

        while(!Q.isEmpty())
        {
            QItem qi = Q.remove();
            int hd = qi.hd;
            TreeNode n = qi.node;

            if (!set.containsKey(hd))
            {
                set.put(hd,n.data);
            }

            if(set.containsKey(hd))
            {
                set.remove(hd);
                set.put(hd,n.data);
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
