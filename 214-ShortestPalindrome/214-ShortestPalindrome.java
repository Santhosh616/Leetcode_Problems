// Last updated: 8/7/2025, 3:20:49 PM
class Solution {
    public String shortestPalindrome(String s) {
        String t = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < t.length(); i++) {
         if (s.startsWith(t.substring(i))) {
           return t.substring(0, i) + s;
         }
        }
    return t + s;
    }
}