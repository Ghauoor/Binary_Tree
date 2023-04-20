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
}
