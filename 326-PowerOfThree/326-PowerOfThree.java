// Last updated: 9/3/2025, 10:18:21 AM
public class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPowerOf3 = 1162261467; 
        return n > 0 && maxPowerOf3 % n == 0;
    }
}