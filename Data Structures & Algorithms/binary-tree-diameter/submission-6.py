# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if root == None:
            return 0
        
        return max(self.maxHeight(root.left) + self.maxHeight(root.right), self.diameterOfBinaryTree(root.right) + self.diameterOfBinaryTree(root.left))

    def maxHeight(self, root):
        if root == None:
            return 0
        
        return max(self.maxHeight(root.right), self.maxHeight(root.left)) + 1