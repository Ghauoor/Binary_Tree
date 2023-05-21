package Traversals;

import Questions.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//https://leetcode.com/problems/binary-tree-preorder-traversal/description/

public class PreOrder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        if (root == null)
            return preOrder;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            root = st.pop();
            preOrder.add(root.val);
            //// Push right first Stack --> LIFO
            //// PreOrder --> Root Left Right
            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }

        }
        return preOrder;
    }

    // Recursive Approach
    public List<Integer> preorderTraversalRecursively(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        preOrder(root, nodes);
        return nodes;
    }

    private void preOrder(TreeNode root, List<Integer> nodes) {
        if (root == null) return;
        nodes.add(root.val);
        preOrder(root.left, nodes);
        preOrder(root.right, nodes);

    }
}
