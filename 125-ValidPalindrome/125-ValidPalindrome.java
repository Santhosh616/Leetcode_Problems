// Last updated: 8/7/2025, 3:21:02 PM
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right)
        {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }
}