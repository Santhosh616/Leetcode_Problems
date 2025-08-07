// Last updated: 8/7/2025, 3:20:03 PM
class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count=0;
        int n=nums.length;
        int m=pattern.length;
        int i=0;
        int j=0;
        int k=pattern.length+1;
        while(j<n){
            if((j-i+1)==k){
               if(matchesPattern(nums,pattern ,i,j)){
                count++;
               } 
               i++;
            }
            j++;
        }
        return count;
    }
    
	    private static boolean matchesPattern(int[] nums, int[] pattern, int i,int j) {
	        boolean isValid=false;
	    	for (int x = 0; x < pattern.length; x++) {
	         if(i<j&&pattern[x]==1&& nums[i]<nums[i+1]) {
	        	isValid=true;
	         }
               
	         else if(i<j&&pattern[x]==0&& nums[i]==nums[i+1]) {
		        	isValid=true;
		         }
                
	         else if(i<j&&pattern[x]==-1&& nums[i]>nums[i+1]) {
		        	isValid=true;
		         }
	         else {
	        	 return false;
	         }
	         i++;
	        }
	        return isValid;
	    }
}