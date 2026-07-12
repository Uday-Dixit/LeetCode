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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> useFull = new ArrayList<>();
        List<Double> ans = new ArrayList<>();
        useFull=BFS(root);
        for(int i=0;i<useFull.size();i++){
                Double a=0.00000;
                int count = 0;
            for(int j=0;j<useFull.get(i).size();j++){
                count++;
                a+=useFull.get(i).get(j);
            }
            ans.add(a/count);
        }
        return ans;
    }
    public List<List<Integer>> BFS(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans ;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subAns = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();
                subAns.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(subAns);
        }
        return ans; 
    }

}