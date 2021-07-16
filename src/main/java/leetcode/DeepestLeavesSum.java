package leetcode;

// TODO
// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }

public class DeepestLeavesSum {
    static int sum = 0;
    static int max = 0;

    private static void helper(TreeNode root,int level)
    {
        if(root == null) {
            return;
        }

        if(level > max)
        {
            sum = 0;
            max = level;
        }

        if(level == max) {
            sum += root.val;
        }

        helper(root.left,level+1);
        helper(root.right,level+1);
    }

    private static int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        helper(root,0);
        return sum;
    }

    public static void main(String[] args) {
        deepestLeavesSum(new TreeNode(3));
    }
}
