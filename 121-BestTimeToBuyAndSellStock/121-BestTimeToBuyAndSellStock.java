// Last updated: 7/30/2025, 9:21:59 AM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize minimum price to maximum possible integer value
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price); // Update the minimum buying price
            int profit = price - minPrice; // Calculate the potential profit if sold today
            maxProfit = Math.max(maxProfit, profit); // Update the maximum profit found so far
        }

        return maxProfit;
    }
}