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

        int leftDiameter = calculateDiameter(root.left);
        int rightDiameter = calculateDiameter(root.right);

        int currDiameter = leftDiameter + rightDiameter;
        maxDiameter = Math.max(maxDiameter, currDiameter);

        return 1 + Math.max(leftDiameter, rightDiameter);
    }
}
