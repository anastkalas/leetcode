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
    public int sumOfLeftLeaves(TreeNode root) {
        int result=0;

        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();//αποθηκευω διευθυνσεις σε queue
        queue.offer(root);
        while(!queue.isEmpty()){
            //int levelsize=queue.size();
            //List<Integer> currentlevel=new LinkedList<>();

            //for(int i=0;i<levelsize;i++){
                TreeNode node=queue.poll();
                //currentlevel.add(node.val);
                if(node.left!=null){
                    if(node.left.left==null && node.left.right==null){
                        result=result+node.left.val;
                    }
                    else{
                        queue.add(node.left);
                    }
                }
                if(node.right!=null){
                    if(node.right.left!=null || node.right.right!=null){
                        queue.add(node.right);
                    }
                }
            //}
        }
        return result;
    }
}
