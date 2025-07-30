// Last updated: 7/30/2025, 9:21:13 AM
class Solution {
    public void reverseString(char[] s) {
        for (int i=0; i<s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
}
 