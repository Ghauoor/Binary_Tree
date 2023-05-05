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
}
