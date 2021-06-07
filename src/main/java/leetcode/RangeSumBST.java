package leetcode;

public class RangeSumBST {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;

        if (root == null) {
            return 0;
        }

        // Root 노드가 low <= root.val <= high 인지 확인 및 sum
        if (low <= root.val && root.val <= high) {
            result += root.val;
        }

        // Root 노드의 좌측 노드 탐색
        result += rangeSumBST(root.left, low, high);
        // Root 노드의 우측 노드 탐색
        result += rangeSumBST(root.right, low, high);

        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
    }

    // TreeNode
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
