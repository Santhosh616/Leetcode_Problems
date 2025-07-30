// Last updated: 7/30/2025, 9:21:10 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm1=new HashMap<>();
        HashMap<Integer,Integer>hm2=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:nums1)
        {
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        }
        for(int i:nums2)
        {
            hm2.put(i,hm2.getOrDefault(i,0)+1);
        }
        for(int i:nums2)
            {
                if(hm1.containsKey(i)&&hm2.containsKey(i))
                {
                    list.add(i);
                     if(hm2.get(i)==1)
                {
                    hm2.remove(i);
                }
                else{
                    hm2.put(i,hm2.get(i)-1);
                }
                if(hm1.get(i)==1){
                    hm1.remove(i);
                }
                else{
                     hm1.put(i,hm1.get(i)-1);
                }
                }
               
            }
       
       
        int [] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}