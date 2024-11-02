/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static ListNode BruteForce(ListNode head){
        if(head==null ||head.next==null){
            return null;
        }
        Set<ListNode>s = new HashSet<>();
        ListNode temp = head;
        while(temp!=null){
            if(!s.contains(temp)){
                s.add(temp);
            }else if(s.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
      return null;
    }
    public static ListNode Optimal(ListNode head){
        if(head==null ||head.next==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                while(entry!=slow){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
      //return BruteForce(head);
      return Optimal(head);       
    }
}