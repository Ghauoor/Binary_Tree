package Traversals;

import Questions.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-postorder-traversal/description/
//https://takeuforward.org/data-structure/post-order-traversal-of-binary-tree/
public class PostOrder_Traversal {
    //Using one stack
    /*
    Algo
    Push root to first stack1
    put top of stack1 into stack2
    now check for stack1 left and right and put it into stack1
    repeat it until stack1 become empty()
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        List<Integer> nodes = new ArrayList<>();

        if (root == null) return nodes;
        st1.push(root);

        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if (root.left != null) st1.push(root.left);
            if (root.right != null) st1.push(root.right);
        }

        while (!st2.isEmpty()) {
            nodes.add(st2.pop().val);
        }
        return nodes;
    }

    //----------------------------Recursion-------------------------------------------------------------
    public List<Integer> postorderTraversalRecurse(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        postorder(root, nodes);
        return nodes;
    }

    private void postorder(TreeNode root, List<Integer> nodes) {
        if (root == null) {
            return;
        }
        postorder(root.left, nodes);
        postorder(root.right, nodes);
        nodes.add(root.val);
    }

    //---------------------------------Single Stack----------------------------------------------
    public List<Integer> postorderTraversalUsingOneStack(TreeNode root) {
        ArrayList<Integer> nodes = new ArrayList<>();

        if (root == null) {
            return nodes;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.peek();
                    stack.pop();
                    nodes.add(temp.val);

                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.peek();
                        stack.pop();
                        nodes.add(temp.val);
                    }
                } else {
                    root = temp;
                }
            }
        }
        return nodes;
    }

    // Easy --------- PostOrder using One Stack------------------------
    public List<Integer> postorderTraversalOneStackEasy(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return ans;
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            ans.addFirst(curr.val);

            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        return ans;
    }
}

