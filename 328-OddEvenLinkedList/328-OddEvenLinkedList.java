// Last updated: 7/30/2025, 9:21:14 AM
class Solution {
    public ListNode oddEvenList(ListNode head) {
       
        if (head==null || head.next==null) return head;

        ListNode lastOdd = head;   
        ListNode cur = head.next;   

        while (cur!=null && cur.next!=null){
            ListNode odd = cur.next;    
            cur.next = cur.next.next;   
            
            odd.next = lastOdd.next;
            lastOdd.next = odd;
            lastOdd = odd;

            cur = cur.next;
        }
        return head;
    }
}