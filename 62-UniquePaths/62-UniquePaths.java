// Last updated: 8/7/2025, 3:21:18 PM
public class Solution {
    public int uniquePaths(int m, int n) {
        var total = m + n - 2;
        var k = Math.min(m - 1, n - 1);
        long ans = 1;
        for (var i = 1; i <= k; i++) {
            ans = ans * (total - k + i) / i;
        }
        return (int) ans;
    }
}