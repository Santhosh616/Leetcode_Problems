// Last updated: 7/30/2025, 9:21:27 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if((root == p || root == q) || (root.val > p.val && root.val < q.val) || (root.val < p.val && root.val > q.val)) return root;
            if(root.val>p.val && root.val>q.val){
                root = root.left;
            }else if(root.val<p.val && root.val<q.val){
                root = root.right;
            }
        }
        return root;
        
    }
}