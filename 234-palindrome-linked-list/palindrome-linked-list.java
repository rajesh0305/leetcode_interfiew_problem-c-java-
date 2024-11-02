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
    public static boolean check(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left = left+1;
            right = right-1;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
       String s = "";
       ListNode temp = head;
       while(temp!=null){
        char data = (char)temp.val;
        s = s+data;
        temp = temp.next;
       } 
       if(check(s)==true){
        return true;
       }
       return false;
    }
}