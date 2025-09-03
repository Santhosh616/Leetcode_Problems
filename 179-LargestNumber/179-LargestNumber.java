// Last updated: 9/3/2025, 10:18:42 AM
class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];         
        for(int i=0; i<nums.length; i++)  s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
        return s[0].equals("0") ? "0" : String.join("",s);
    }
}
 
