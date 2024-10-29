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
    public static void merge(ArrayList<Integer>a,ArrayList<Integer>b,ArrayList<Integer>ans){
        int n = a.size();
        int m = b.size();
        int i = 0;
        int j =0;
        while(i<n && j<m){
             if(a.get(i)<=b.get(j)){
              ans.add(a.get(i));
              i++;
             }else{
                ans.add(b.get(j));
                j++;
             }
        }
        while(i<n){
            ans.add(a.get(i));
            i++;
        }
        while(j<m){
            ans.add(b.get(j));
            j++;

        }

    }
    public static ListNode CreateList(ArrayList<Integer>ans){
                ListNode dummy = new ListNode(-1);
                ListNode temp = dummy;
                int i = 0;
                while(i<ans.size()){
                    int data = ans.get(i);
                    ListNode newnode =new ListNode(data);
                    temp.next = newnode;
                    temp = temp.next;
                }
                return dummy.next;
    }
    public static ListNode merge(ListNode list1 ,ListNode list2){
        ListNode l1 =list1;
        ListNode l2 = list2;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val>l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;

        }
        ListNode res = l1;
        while(l1!=null && l2!=null){
            ListNode temp = null;
            while(l1!=null && l1.val<=l2.val){
                temp =l1;
                l1 = l1.next;

            }
            temp.next = l2;

            ListNode tp = l1;
            l1 = l2;
            l2 = tp; 
        }
        return res;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //    ArrayList<Integer>first = new ArrayList<Integer>();
    //    ListNode temp =list1;
    //    while(temp!=null){
    //     int data = temp.val;
    //     first.add(data);
    //     temp = temp.next;

    //    }
    //    ArrayList<Integer>second = new ArrayList<Integer>();
    //    ListNode curr = list2 ;
    //    while(curr!=null){
    //     int data = curr.val;
    //     second.add(data);
    //     curr =curr.next;
    //    }
    //    Collections.sort(first);
    //    Collections.sort(second);
    //    ArrayList<Integer>ans = new ArrayList<Integer>();
    //    merge(first,second,ans); 
    //    return CreateList(ans);
    return merge(list1,list2);
    }
}