/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;int c1=0;
        while(l1!=null)
        {
            c1++;
            l1=l1.next;
        }
        ListNode l2=headB;int c2=0;
        while(l2!=null)
        {
            c2++;
            l2=l2.next;
        }
        int a=Math.abs(c1-c2);
        ListNode l3,l4;int c=0;
        if(c1>=c2)
        {
            c=1;
            l3=headA;
            while(a!=0)
            {
                l3=l3.next;a--;
            }
        }
        else
        {
            c=2;
            l3=headB;
            while(a!=0)
            {
                l3=l3.next;a--;
            }
        }
        if(c==1)
        {
            l4=headB;
            while(l3!=null&&l4!=null)
            {
                if(l3==l4)return l3;
                l3=l3.next;
                l4=l4.next;
            }
        }
        else
        {
            l4=headA;
            while(l3!=null&&l4!=null)
            {
                if(l3==l4)return l3;
                l3=l3.next;
                l4=l4.next;
            }
        }
        return null;
    }

}