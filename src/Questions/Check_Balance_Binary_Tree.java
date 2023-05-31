package Questions;
//https://leetcode.com/problems/balanced-binary-tree/
public class Check_Balance_Binary_Tree {
    private int height(TreeNode root) {
        if (root == null) return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        int diff = Math.abs(height(root.left) - height(root.right));

        return left && right && diff <= 1;
    }

    // Better Approach

    public boolean isBalancedTree(TreeNode root)  {
        return dfsHeight(root) != -1;
    }

    int dfsHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }


}
