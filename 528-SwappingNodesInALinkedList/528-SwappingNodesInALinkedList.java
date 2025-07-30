// Last updated: 7/30/2025, 9:20:50 AM
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode temp1=head;
        for(int i=1;i<k;i++)
        temp=temp.next;
        ListNode curr = temp;
        while(curr.next!=null){
            curr = curr.next;
            temp1=temp1.next;
        }
        int t = temp.val;
        temp.val = temp1.val;
        temp1.val =t;
        return head;
    }
}