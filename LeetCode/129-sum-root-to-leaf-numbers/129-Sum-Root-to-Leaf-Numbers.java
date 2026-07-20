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
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        helper(root,0);
        return ans;
    }
    public void helper(TreeNode node,int digit){
        if(node==null)return;
        digit=(digit*10)+node.val;
        if(node.left==null && node.right==null){
            ans+=digit;
        }
        helper(node.left,digit);
        helper(node.right,digit);
    }
}