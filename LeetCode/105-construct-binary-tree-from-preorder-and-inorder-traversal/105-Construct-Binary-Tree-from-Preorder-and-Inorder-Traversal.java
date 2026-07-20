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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1,0, inorder.length - 1);
    }
    public TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd)return null;
        TreeNode node = new TreeNode(preorder[preStart]);
        int leftSize=0;
        int a = 0;
        for(int i=inStart;i<inEnd+1;i++){
            if(inorder[i]==node.val){
                leftSize=i-inStart;
                a=i;
                break;
            }
        }
        node.left=build(preorder,inorder,preStart+1,preStart+leftSize,inStart,a-1);
        node.right=build(preorder,inorder,preStart+leftSize+1,preEnd,a+1,inEnd);
        return node;
    }
}