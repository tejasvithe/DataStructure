package Level_Order_Traversal;

/**
 * Created by Tejasvi Kumar on 29-05-2017.
 */
public class BinaryTreeLauncher {
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(1);
        root.left = new BinaryNode(2);
        root.right = new BinaryNode(3);
        root.left.right = new BinaryNode(4);
        root.left.right.right = new BinaryNode(5);
        root.left.right.right.right = new BinaryNode(6);

        BinaryTreeUtilitty t = new BinaryTreeUtilitty();

        t.printTopView(root);

    }
}
