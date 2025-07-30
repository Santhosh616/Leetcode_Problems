// Last updated: 7/30/2025, 9:31:21 AM
class Solution {
    public int trap(int[] height) {
        int water = 0;
        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            if (height[l] < height[r]) {
                if (lmax < height[l]) {
                    lmax = height[l];
                } else {
                    water += lmax - height[l];
                }
                l++;
            } else {
                if (rmax < height[r]) {
                    rmax = height[r];
                } else {
                    water += rmax - height[r];
                }
                r--;
            }
        }
        return water;
    }
}