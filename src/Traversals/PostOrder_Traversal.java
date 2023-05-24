package Traversals;

import Questions.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-postorder-traversal/description/
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
}
