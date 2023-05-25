package Traversals;


import Questions.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class InOrder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        // InOrder--> Left Root Right

        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty())
                    break;

                node = stack.pop();
                inOrder.add(node.val);
                node = node.right;
            }
        }
        return inOrder;
    }

    //-----------------------------------------------------------------
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> nodes = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                nodes.add(stack.peek().val);
                root = stack.pop().right;
            }
        }
        return nodes;
    }

    public List<Integer> inorderTraversalRecurs(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inOrder(root, nodes);
        return nodes;
    }

    private void inOrder(TreeNode root, List<Integer> nodes) {
        if (root == null) return;

        inOrder(root.left, nodes);
        nodes.add(root.val);
        inOrder(root.right, nodes);
    }
}
