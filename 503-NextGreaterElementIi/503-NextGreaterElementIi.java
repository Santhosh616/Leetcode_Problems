// Last updated: 7/30/2025, 9:20:51 AM

class Solution {
    class Index{
    int val;
    int index;
    Index(int val, int index){
        this.val = val;
        this.index = index;
    }
}
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);
        Stack<Index> s = new Stack<>();
        for(int i = 0; i<2*nums.length; i++){
            while(!s.isEmpty() && s.peek().val < nums[(i%nums.length)]){
                Index a = s.pop();
                arr[a.index] = nums[(i%nums.length)];
            }
            if(i < nums.length) {
                s.push(new Index(nums[(i % nums.length)],(i% nums.length)));
            }
        }

        return arr;
    }
}