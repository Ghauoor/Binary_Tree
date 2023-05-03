package Questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-inorder-traversal/description/

public class In_Order_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
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
