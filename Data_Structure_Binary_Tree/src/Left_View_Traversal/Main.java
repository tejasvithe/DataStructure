package Left_View_Traversal;

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
        root.right.left.right = new TreeNode(8);

        Tree tree = new Tree();
        tree.leftView(root,1);
    }
}
