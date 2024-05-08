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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        // If the current node's value is greater than the target value, search in the left subtree
        if (root.val > val) {
            return searchBST(root.left, val);
        }

        // If the current node's value is less than the target value, search in the right subtree
        return searchBST(root.right, val);
    }
}
