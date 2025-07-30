// Last updated: 7/30/2025, 9:21:39 AM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while (curr != null) {

            next = curr.next;

            
            curr.next = prev;
            prev = curr;
            curr = next;
        }  
        return prev;
    }
}