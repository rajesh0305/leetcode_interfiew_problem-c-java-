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
    public static int find(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count =count+1;
            temp = temp.next;

        }
        return count;

    }
    public static  ListNode navie(ListNode head){
        int len = find(head);
        int mid = len/2;
        int i = 0;
        ListNode temp =head;
         while(i<=mid){
            if(temp!=null)
            temp = temp.next;
         }
         return temp;
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast =head;

        if(head==null){
            return head;
        }

        if(head.next==null){
            return head;
        }

        if(head.next.next==null){
            return head.next;
        }

        while(fast.next!=null && fast.next.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode newnode = null;
        if(fast.next!=null){
            newnode =  slow.next;}else{
        if(fast!=null)
           newnode = slow;    }
        
        return newnode ;
        //return navie(head);
    }
}