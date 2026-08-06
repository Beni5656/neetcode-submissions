/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int maxDiameter;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
        return maxDiameter;
    }

    private int calculateDiameter(TreeNode root) {
        if (root == null) return 0;

        int left = calculateDiameter(root.left);
        int right = calculateDiameter(root.right);

        maxDiameter = Math.max(maxDiameter, left + right);

        return 1 + Math.max(left, right);
    }
}
