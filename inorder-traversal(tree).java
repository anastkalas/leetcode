public class Solution {
    // Main function to perform inorder traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); // List to store the result
        // Call the recursive function to perform inorder traversal
        inorderTraversalRecursive(root, result);
        return result; // Return the final result
    }
    
    // Recursive function to perform inorder traversal
    private void inorderTraversalRecursive(TreeNode node, List<Integer> result) {
        // Base case: if the node is null, return
        if (node == null) {
            return;
        }
        // Recursively traverse the left subtree
        inorderTraversalRecursive(node.left, result);
        // Add the current node's value to the result list
        result.add(node.val);
        // Recursively traverse the right subtree
        inorderTraversalRecursive(node.right, result);
    }
}
