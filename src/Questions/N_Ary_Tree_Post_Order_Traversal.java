package Questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal/
public class N_Ary_Tree_Post_Order_Traversal {
    private final List<Integer> nodes = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null)
            return nodes;

        for (Node node :
                root.children) {
            postorder(node);
        }
        nodes.add(root.val);
        return nodes;
    }
}
