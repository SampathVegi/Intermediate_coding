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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode head = l;
        int x=0,y=0,carry=0,sum=0;
        while(l1 != null|l2!=null){
            if(l1!=null){
            x=l1.val;
        }
        else{
            x=0;
        }
        if(l2!=null){
            y=l2.val;
        }
        else{
            y=0;
        }
        sum=x+y+carry;
        carry=sum/10;
        l.next=new ListNode(sum%10);
        l=l.next;
        if(l1!=null){
            l1=l1.next;
        }
        if(l2!=null){
            l2=l2.next;
        }
        if(carry>0){
            l.next=new ListNode(carry);
        }
    }
        return head.next;
}
}