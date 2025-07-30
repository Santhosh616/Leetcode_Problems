// Last updated: 7/30/2025, 9:31:00 AM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
       
        if (p == null && q == null) {
            return true;
        }
       
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
           return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}