package Left_View_Traversal;

/**
 * Created by Tejasvi Kumar on 29-05-2017.
 */
public class Tree {
    static int max =0;

    public void leftView(TreeNode root,int level)
    {


        if(root == null)
        {
            return ;
        }

        if(max < level)
        {
            System.out.println(root.data + " ");
            max = level;
        }
        leftView(root.left ,level+1);
        leftView(root.right,level+1);
    }
}
