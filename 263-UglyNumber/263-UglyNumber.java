// Last updated: 7/30/2025, 9:21:23 AM
class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
        return false;
        }
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        return n==1;
    }
}