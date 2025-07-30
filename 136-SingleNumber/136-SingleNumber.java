// Last updated: 7/30/2025, 9:21:56 AM
class Solution {
    public int singleNumber(int[] nums) {
        int num = nums[0];
        for(int i = 1; i < nums.length; i++) num ^= nums[i];
        return num;
    }
}