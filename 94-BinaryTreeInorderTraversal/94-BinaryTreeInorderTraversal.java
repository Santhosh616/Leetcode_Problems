// Last updated: 7/30/2025, 9:31:01 AM

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        return helper(root, list);
    }
    public List<Integer> helper(TreeNode node, ArrayList<Integer> list) {
        if(node == null) {
            return list;
        }

        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
        return  list;
    }
}