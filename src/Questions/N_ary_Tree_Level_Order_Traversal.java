package Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/
public class N_ary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if (root != null) q.add(root);

        while (!q.isEmpty()) {
            int currLevel = q.size();

            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < currLevel; i++) {
                Node node = q.poll();

                assert node != null;
                level.add(node.val);
                q.addAll(node.children);
            }
            res.add(level);
        }

        return res;
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
