package Right_Level_Traversal;

/**
 * Created by Tejasvi Kumar on 29-05-2017.
 */
public class Tree {
max_level  max =  new max_level();
    public void rightView(TreeNode root,int level,max_level max)
    {
        if(root == null)
            return ;

        if(level > max.max)
        {
            System.out.print(root.data + " " );
            max.max = level ;
        }
        rightView(root.right,level+1,max);
        rightView(root.left,level+1,max);
    }
}
