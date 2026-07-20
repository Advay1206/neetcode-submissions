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
    ListNode reverse(ListNode head, ListNode tail){
        ListNode rev = null;
        while(head != tail){
            ListNode temp = head.next;
            head.next = rev;
            rev = head;
            head = temp;
        }
        return rev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        while (head != null) {
            ListNode temp = head;
            int count = 0;
            for (int i = 0; i < k; i++) {
                if (temp == null) break;
                temp = temp.next;
                count++;
            }
            if (count == k) {
                ListNode rev = reverse(head, temp);
                dummy.next = rev;
                dummy = head;
                head = temp;
            } else {
                dummy.next = head;
                break;
            }
        }
        return res.next;
    }
}