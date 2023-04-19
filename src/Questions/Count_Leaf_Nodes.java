package Questions;
//https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1
public class Count_Leaf_Nodes {
    int count = 0;
    int countLeaves(TreeNode node) {
        // Your code
        if (node == null) return 0;

        if (node.left == null && node.right == null)
            count++;

        countLeaves(node.left);
        countLeaves(node.right);

        return count;
    }
}
