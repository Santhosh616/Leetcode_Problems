// Last updated: 7/30/2025, 9:20:37 AM
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int a=0;
        int b=1;
        int fib=0;
	    for(int i=2;i<=n;i++){
	        fib=a+b;
	        a=b;
	        b=fib;
    }
return fib;
}      
}