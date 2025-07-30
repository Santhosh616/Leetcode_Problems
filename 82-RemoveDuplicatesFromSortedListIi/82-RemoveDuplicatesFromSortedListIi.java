// Last updated: 7/30/2025, 9:31:05 AM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(1,head); 
        ListNode cur = dummy; 
        cur.next=head;

        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) { 
                int val = cur.next.val;
                while (cur.next != null && cur.next.val == val) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}