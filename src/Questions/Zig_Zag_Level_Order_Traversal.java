package Questions;

import java.util.*;
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

public class Zig_Zag_Level_Order_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) q.add(root);

        boolean reverse = false;

        while (!q.isEmpty()) {
            int currLevel = q.size();

            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < currLevel; i++) {
                TreeNode node = q.poll();


                level.add(node.val);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            if (reverse) Collections.reverse(level);
            reverse = !reverse;

            result.add(level);
        }

        return result;
    }
}
