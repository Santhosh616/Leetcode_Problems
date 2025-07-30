// Last updated: 7/30/2025, 9:32:04 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        int i=0;
        int j=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {i,j};
    }
}