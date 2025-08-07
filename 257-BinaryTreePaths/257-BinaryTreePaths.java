// Last updated: 8/7/2025, 3:20:40 PM
class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        Path(root, ""); 
        return ans;
    }

    public void Path(TreeNode root, String path) {
        if (root.left == null && root.right == null) {
            ans.add(path + root.val);  
        }

        if (root.left != null)
            Path(root.left, path + root.val + "->");

        if (root.right != null)
            Path(root.right, path + root.val + "->");
    }
}