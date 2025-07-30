// Last updated: 7/30/2025, 9:21:20 AM
class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int defaultSum = (N*(N+1))/2;

        int totalSum = 0;
        for(int i = 0; i < N; i++){
            totalSum += nums[i];
        }

        int diff = defaultSum - totalSum;
        return diff;
    }
}