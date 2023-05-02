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

    //Without using collection
    public List<List<Integer>> zigzagLevelOrderTraversal(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(root == null) {
            return ret;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        boolean flag = true;
        while(!que.isEmpty()){
            LinkedList<Integer> levelnode = new LinkedList<>();
            int len  = que.size();
            for(int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                if(flag) {
                    levelnode.add(temp.val);
                } else {
                    levelnode.add(0,temp.val);
                }
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
            }
            flag = !flag;
            ret.add(levelnode);
        }
        return ret;
    }
}
