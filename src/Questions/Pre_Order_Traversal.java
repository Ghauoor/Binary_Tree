package Questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/description/

public class Pre_Order_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
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
