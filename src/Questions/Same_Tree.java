package Questions;
//https://leetcode.com/problems/same-tree/description/
public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null) {
            return false;
        }

        if (q == null) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        boolean value = p.val == q.val;

        return left && right  && value;
    }

    //-------------------Same Approach with optimize code----------------------

    public boolean isSameTrees(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return (p == q);
        }
        return (p.val == q.val) && isSameTrees(p.left, q.left) && isSameTrees(p.right, q.right);
    }
}
