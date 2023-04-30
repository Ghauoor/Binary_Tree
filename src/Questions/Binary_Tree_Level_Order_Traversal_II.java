package Questions;

import java.util.*;
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
public class Binary_Tree_Level_Order_Traversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if (root != null) q.add(root);

        while (!q.isEmpty()) {
            int currLevel = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < currLevel; i++) {
                TreeNode cur = q.poll();

                if (cur != null && cur.left != null) q.add(cur.left);
                if (cur != null && cur.right != null) q.add(cur.right);

                level.add(cur.val);
            }

            res.add(0, level);
        }
        //Reverse the
        //Collections.reverse(res);

        return res;
    }
}
