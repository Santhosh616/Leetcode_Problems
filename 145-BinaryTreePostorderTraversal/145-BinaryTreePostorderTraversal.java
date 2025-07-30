// Last updated: 7/30/2025, 9:21:52 AM

class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        postorder(root,result);
        return result;
    }
        public void postorder(TreeNode root,List<Integer>result){
            if(root==null)
            return;
            postorder(root.left,result);
            postorder(root.right,result);
            result.add(root.val);
        }       
    }
