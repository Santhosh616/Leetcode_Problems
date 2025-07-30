// Last updated: 7/30/2025, 9:21:30 AM
class MyQueue {

    private Stack<Integer> st;
    
    private Stack<Integer> st2;

    public MyQueue() {
        st = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        
        if (st2.isEmpty()) {
            while (!st.isEmpty()) {
                st2.push(st.pop());
            }
        }
       
        return st2.pop();
    }
    
    public int peek() {
        
        if (st2.isEmpty()) {
            while (!st.isEmpty()) {
                st2.push(st.pop());
            }
        }
        
        return st2.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && st2.isEmpty();
    }
}
