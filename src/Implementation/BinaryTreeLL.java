package Implementation;

import java.util.LinkedList;
import java.util.Queue;

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

    //Level Order traversal Or BST-->  Breadth-first Search Traversal
    //TC: O(N)
    //SC: O(N)

    /*
    * Simple Level Order Traversal is
    * // Level Order
      void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
          BinaryNode presentNode = queue.remove();
          System.out.print(presentNode.value + " ");
          if (presentNode.left != null) {
            queue.add(presentNode.left);
          }
          if (presentNode.right != null) {
            queue.add(presentNode.right);
          }
        }
      }
    *
    * */


    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        queue.add(null);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.peek();
            queue.poll();

            if (presentNode == null) { // Means old level is completely traversed
                System.out.println();

                if (!queue.isEmpty()) {// Means old level is completely traversed
                    queue.add(null);
                }
            } else {
                System.out.print(presentNode.value + " ");
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }

                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
    }

    //// Search in Binary Tree
    //// Using Level Order Traversal
    //// TC : O(N)
    //// SC : O(N)

    public void search(String value) {
        Queue<BinaryNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryNode present = q.remove();
            if (present.value == value) {
                System.out.println("The Value is " + value + " is found in Tree");
                return;
            } else {
                if (present.left != null) {
                    q.add(present.left);
                }
                if (present.right != null) {
                    q.add(present.right);
                }
            }
        }

        System.out.println("The Value is " + value + " is not found in Tree");
    }

    //// Insert Method
    //// TC: O(N)
    //// SC: O(N)
    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;

        if (root == null) {
            root = newNode;
            System.out.println("Successfully Insert a new Node at Root");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();

            //now check for left or right vacant place
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully Inserted");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully Inserted");
                break;
            } else {
                //if donot find any place continue loop through
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    //// Deleting a node from binary tree
    /*
     * (i)-> Find the Node
     * (ii)--> find the deepest node
     * (iii)---> Set the Deepest Node val to current node value
     * (iV) ----> Delete the deepest Node
     */

    //Get The Deepest Node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();

            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);
        BinaryNode preNode, presentNode = null;

        while (!queue.isEmpty()) {
            preNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                preNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }

            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }

    }

}
