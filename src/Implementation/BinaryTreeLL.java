package Implementation;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //PreOrder Traversal
    //TC: --> O(N)
    //SC: --> O(N)
    public void preOrder(BinaryNode node) {
        //Base case
        if (node == null) return;

        System.out.print(node.value + " ");
        preOrder(node.left); //TC --> O(N / 2)
        preOrder(node.right); //TC --> O(N / 2)
    }

    //inOrder Traversal
    //TC: --> O(N)
    //SC: --> O(N)
    public void inOrder(BinaryNode node) {
        //Base case
        if (node == null) return;

        inOrder(node.left); //TC --> O(N / 2)
        System.out.print(node.value + " ");
        inOrder(node.right); //TC --> O(N / 2)
    }

    //PostOrder Traversal
    //TC: --> O(N)
    //SC: --> O(N)
    public void postOrder(BinaryNode node) {
        //Base case
        if (node == null) return;

        postOrder(node.left); //TC --> O(N / 2)
        postOrder(node.right); //TC --> O(N / 2)
        System.out.print(node.value + " ");
    }
}
