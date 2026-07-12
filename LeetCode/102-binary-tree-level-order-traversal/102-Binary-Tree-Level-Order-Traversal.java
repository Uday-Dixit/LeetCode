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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        solve(root,0,ans);
        return ans;
    }
    public void solve(TreeNode node, int level, List<List<Integer>> ans){
        if(node==null){
            return;
        }
        if(level==ans.size()){
            List<Integer> levelAns = new ArrayList<>();
            ans.add(levelAns);
        }
        ans.get(level).add(node.val);
        solve(node.left,level+1,ans);
        solve(node.right,level+1,ans);
    }
}