package Implementation;

public class Test_BinaryTreeLL {
    public static void main(String[] args) {
        BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
        binaryTreeLL.insert("N1");
        binaryTreeLL.insert("N2");
        binaryTreeLL.insert("N3");
        binaryTreeLL.insert("N4");
        binaryTreeLL.insert("N5");
        binaryTreeLL.insert("N6");
        binaryTreeLL.insert("N7");
        binaryTreeLL.insert("N8");
        binaryTreeLL.insert("N9");
        binaryTreeLL.levelOrder();
        System.out.println("XxxxXXXXxxxxXXXxxx");
        System.out.println(binaryTreeLL.getDeepestNode().value);
        System.out.println("XxxxXXXXxxxxXXXxxx");
        binaryTreeLL.deleteNode("N10");
        binaryTreeLL.levelOrder();
        /*
        BinaryNode N1 = new BinaryNode();
        N1.value = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;

        binaryTreeLL.root = N1;

        System.out.println("\n********* PRE ORDER TRAVERSAL ***********");
        //Pre Order traversal
        binaryTreeLL.preOrder(binaryTreeLL.root);
        System.out.println("\n********* IN ORDER TRAVERSAL ***********");
        //in-Order Traversal
        binaryTreeLL.inOrder(binaryTreeLL.root);
        System.out.println("\n********* POST ORDER TRAVERSAL ***********");
        //Post-Order Traversal
        binaryTreeLL.postOrder(binaryTreeLL.root);

        System.out.println("\n********* Level ORDER TRAVERSAL ***********");

        binaryTreeLL.levelOrder();

        //Search Method
        binaryTreeLL.search("N4");

         */

    }
}
