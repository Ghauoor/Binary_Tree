package Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal/description/
public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode cur = q.poll();
                if (cur != null && cur.left != null) q.add(cur.left);
                if (cur != null && cur.right != null) q.add(cur.right);
                if (cur != null) {
                    level.add(cur.val);
                }
            }
            res.add(level);
        }

        return res;

    }
}
