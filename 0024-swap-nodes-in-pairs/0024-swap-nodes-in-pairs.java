/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        if(head==null || head.next==null){
            return head;
        }
        ListNode dum =new ListNode(0);
        dum.next = head;
        ListNode prev = dum;
        while(prev.next!=null && prev.next.next!=null){
            ListNode cur = prev.next;
            ListNode nxt = cur.next;
            cur.next = nxt.next;
            nxt.next = cur;
            prev.next = nxt;
            prev = cur;
        }
        return dum.next;
    }
}