// Last updated: 7/30/2025, 9:22:08 AM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> t = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode y = q.remove();
                t.add(y.val);
                if(y.left!=null) q.add(y.left);
                if(y.right!=null) q.add(y.right);
            }
            ans.add(0,t);
        }
        return ans;
    }
}