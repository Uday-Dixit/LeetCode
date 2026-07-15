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
    public TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        populateSorted(nums);
        return root;
    }
    public void insert(int data){
        root = insert(data,root);
    }
    private TreeNode insert(int data,TreeNode node){
        if(node==null){
            TreeNode Node = new TreeNode(data);
            return Node;
        }

        if(data<node.val){
            node.left=insert(data,node.left);
        }
        if(data>node.val){
            node.right=insert(data,node.right);
        }
        return node;
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if(start>=end)return;
        int mid = start+(end-start)/2;
        insert(nums[mid]);
        populateSorted(nums,start,mid); 
        populateSorted(nums,mid+1,end); 
    }

}