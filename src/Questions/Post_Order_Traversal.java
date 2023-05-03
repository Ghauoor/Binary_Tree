package Questions;

import java.util.ArrayList;
import java.util.List;


//https://leetcode.com/problems/binary-tree-postorder-traversal/description/
public class Post_Order_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
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
}
