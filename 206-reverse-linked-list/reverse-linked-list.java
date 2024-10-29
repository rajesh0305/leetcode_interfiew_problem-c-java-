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
    public ListNode reverseList(ListNode head) {
       ListNode next = null;
       ListNode curr =head;
       ListNode prev = null;

       if(head==null)return head;

       if(head.next==null)return head;

       while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev =curr;
        curr =next;
       } 
       return prev;
    }
}