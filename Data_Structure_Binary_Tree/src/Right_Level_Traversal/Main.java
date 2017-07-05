package Right_Level_Traversal;

/**
 * Created by Tejasvi Kumar on 29-05-2017.
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        max_level max = new max_level();
        Tree tree = new Tree();
        tree.rightView(root,1,max);
    }
}
