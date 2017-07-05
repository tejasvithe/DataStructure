package BinaryTreeImplementation;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Tejasvi Kumar on 01-04-2017.
 */
public class BinaryTreeMethod {

    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root)
    {
        ArrayList<Integer>  res = new ArrayList<Integer>();
        if(root == null)
        {
            return res;
        }
         Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
            s.push(root);
            while(!s.isEmpty())
            {
                if(root.left == null)
                    s.pop();
            }
        }
    }



}
