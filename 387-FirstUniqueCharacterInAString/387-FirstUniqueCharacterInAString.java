// Last updated: 7/30/2025, 9:21:07 AM
class Solution {
    public int firstUniqChar(String s) {
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(s.indexOf(ch) == s.lastIndexOf(ch))
        return s.indexOf(ch);
      }
      return -1;
      }
}