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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            boolean levelX = false;
            boolean levelY = false;

            TreeNode parentX=null;
            TreeNode parentY=null;

            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();

                if(curr.left!=null){

                    if(curr.left.val==x){
                        levelX=true;
                        parentX=curr;
                    }

                    if(curr.left.val==y){
                        levelY=true;
                        parentY=curr;
                    }

                    q.add(curr.left);
                }

                if(curr.right!=null){

                    if(curr.right.val==x){
                        levelX=true;
                        parentX=curr;
                    }

                    if(curr.right.val==y){
                        levelY=true;
                        parentY=curr;
                    }

                    q.add(curr.right);
                }

            }

            if(levelX && levelY)return parentX!=parentY;

            if(levelX || levelY)return false;

        }
        return false;
    }
}