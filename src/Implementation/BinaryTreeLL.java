package Implementation;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //PreOrder Traversal
    public void preOrder(BinaryNode node) {
        //Base case
        if (node == null) return;

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
