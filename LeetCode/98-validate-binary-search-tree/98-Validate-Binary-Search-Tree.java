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
    public boolean isValidBST(TreeNode root) {
        return isValid(root,-99999999999L,99999999999L);
    }
    public boolean isValid(TreeNode node, long min, long max){
        if(node == null)   return true;
        if(node.val<=min || node.val>=max) return false;
        boolean check = isValid(node.left,min,node.val);
        if(check==false) return false;
        boolean aCheck = isValid(node.right,node.val,max);
        if(aCheck==false) return false;
        return true;
    }
}