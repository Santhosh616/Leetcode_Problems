// Last updated: 7/30/2025, 9:20:40 AM
class Solution {
    public int search(int[] a, int target) {
        int start = 0;
        int end = a.length-1;
        int flag=0;
        while(start<=end){
            int mid =(start+end)/2;
            if(a[mid]==target){
                return mid;
        
            }
            else if(a[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
        
    }
}
