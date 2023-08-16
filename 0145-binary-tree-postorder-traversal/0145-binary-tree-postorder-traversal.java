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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrderTraverse(root, ans);
        return ans;
    }
    
    private void postOrderTraverse(TreeNode root, List<Integer> ans){
        if(root == null)
            return;
        postOrderTraverse(root.left, ans);
        postOrderTraverse(root.right, ans);
        ans.add(root.val);
    }
}