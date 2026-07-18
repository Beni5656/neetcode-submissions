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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode curr = slow.next;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode secondHalf = prev;
        slow.next = null;
        ListNode firstHalf = head;

        while (secondHalf != null && firstHalf != null) {
            ListNode temp = firstHalf.next;
            firstHalf.next = secondHalf;
            ListNode temp2 = secondHalf.next;
            secondHalf.next = temp;

            firstHalf = temp;
            secondHalf = temp2;
        }
    }
}
