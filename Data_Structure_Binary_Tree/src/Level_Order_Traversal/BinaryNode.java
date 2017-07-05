package Level_Order_Traversal;

import java.math.BigInteger;

/**
 * Created by Tejasvi Kumar on 29-05-2017.
 */
public class BinaryNode {
    int data;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int data)
    {
        this.data = data;
        left = right = null;
    }

    public BinaryNode getLeft()
    {
        return left;
    }
    public void setLeft(BinaryNode left)
    {
        this.left = left;
    }
    public int getData()
    {
        return data;
    }
    public void setData(int data)
    {
        this.data = data;
    }

    public BinaryNode getRight()
    {
        return right;
    }
    public void setRight(BinaryNode right)
    {
        this.right= right;
    }

}
