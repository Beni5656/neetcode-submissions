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
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = null;
        ListNode slowPointer = slow.next;

        while (slowPointer != null) {
            ListNode temp = slowPointer.next;
            slowPointer.next = secondHalf;
            secondHalf = slowPointer;
            slowPointer = temp;
        }

        slow.next = null;
        ListNode firstHalf = head;

        while (secondHalf != null) {
            ListNode temp = firstHalf.next;
            firstHalf.next = secondHalf;
            ListNode temp2 = secondHalf.next;
            secondHalf.next = temp;

            firstHalf = temp;
            secondHalf = temp2;
        }
    }
}
