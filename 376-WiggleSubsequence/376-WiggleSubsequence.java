// Last updated: 7/30/2025, 9:21:09 AM
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0) return 0;
        
        int n = nums.length;
        if (n < 2) return n;
        
        int up = 1, down = 1;
        
        for (int i = 1; i < n; ++i) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        
        return Math.max(up, down);
    }
    
    
}