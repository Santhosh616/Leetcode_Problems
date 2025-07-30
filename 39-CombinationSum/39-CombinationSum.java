// Last updated: 7/30/2025, 9:31:22 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();


        combinations(candidates,target,0,path,ans);
        return ans;
    }


    public void combinations(int[] arr,int target,int currIndex,List<Integer> path,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(path));
            return;
        }


        for(int end=currIndex;end<arr.length;end++){

            if(arr[end]<=target){
                path.add(arr[end]);
                combinations(arr,target-arr[end],end,path,ans);
                path.remove(path.size()-1);

            }

        }
    }
}