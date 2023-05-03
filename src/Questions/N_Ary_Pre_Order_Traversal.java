package Questions;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/

public class N_Ary_Pre_Order_Traversal {
    private List<Integer> nodes = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null)
            return nodes;

        nodes.add(root.val);

        for (Node node :
                root.children) {
            preorder(node);
        }

        return nodes;
    }
}
