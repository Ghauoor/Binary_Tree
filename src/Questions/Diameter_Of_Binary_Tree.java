package Questions;
//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
public class Diameter_Of_Binary_Tree {
    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }

    // Function to return the diameter of a Binary Tree.
    private int diameter(TreeNode root) {
        if (root == null) return 0;

        int lD = diameter(root.left);
        int rD = diameter(root.right);
        int comboD = height(root.left) + height(root.right) + 1;

        return Math.max(lD, Math.max(rD, comboD));
    }

    // Code for Leet code
    //https://leetcode.com/problems/diameter-of-binary-tree/description/
    class Solution {
        private int height (TreeNode root) {
            if (root == null) return 0;
            return Math.max(height(root.left), height(root.right)) + 1;
        }

        public int diameterOfBinaryTree(TreeNode root) {
            if (root == null) return 0;

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int lD = diameterOfBinaryTree(root.left);
            int rD = diameterOfBinaryTree(root.right);

            int comboD = leftHeight + rightHeight;

            return Math.max(comboD, Math.max(lD, rD));
        }

    }

    //Easier Code
    private class DiameterOfBTree {
        int max;

        public int diameterOfBinaryTree(TreeNode root) {
            maxDepth(root);
            return max;
        }

        private int maxDepth(TreeNode root) {
            if (root == null) return 0;

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            max = Math.max(max, left + right);

            return Math.max(left, right) + 1;
        }

    }



}
