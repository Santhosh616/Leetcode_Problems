// Last updated: 7/30/2025, 9:21:36 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int size=nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<size;i++)
        { 
            if(map.containsKey(nums[i]))
        {
            if(Math.abs(map.get(nums[i])-i)<=k)
            {
                return true;
            }
        }
            map.put(nums[i],i);
        }
        System.out.println(map);
        return false;
    }
}