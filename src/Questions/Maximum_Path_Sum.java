package Questions;
//https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
public class Maximum_Path_Sum {
    public static int maxPathSum(TreeNode root) {
        int[] maxValue = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    private static int maxPathDown(TreeNode root, int[] maxValue) {
        if (root == null) return 0;
//Just in case if maxPathDown return with -ive value i'll ignore it and return 0 instead
        int left = Math.max(0, maxPathDown(root.left, maxValue));
        int right = Math.max(0, maxPathDown(root.right, maxValue));

        maxValue[0] = Math.max(maxValue[0], left + right + root.val);
        return Math.max(left, right) + root.val;

    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int answer = maxPathSum(root);
        System.out.println("The Max Path Sum for this tree is " + answer);

    }

}
