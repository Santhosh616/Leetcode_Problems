// Last updated: 7/30/2025, 9:31:04 AM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode nn = head;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return nn;        
    }
}