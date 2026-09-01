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
    public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        if(head==null||head.next==null||head.next.next==null)return new int []{-1,-1};
       ListNode l=head.next;ListNode prev=head;
       int [] ans=new int[2];
       ArrayList<Integer>a=new ArrayList<>();int i=2;
       while(l.next!=null)
       {
            if(l.val>prev.val&&l.val>l.next.val)a.add(i);
            if(l.val<prev.val&&l.val<l.next.val)a.add(i);
            i++;
            prev=l;
            l=l.next;
       }
       Collections.sort(a);
       if(a.size()<2)return new int[]{-1,-1};
        ans[1]=a.get(a.size()-1)-a.get(0);
        int min=Integer.MAX_VALUE;
        for(int j=1;j<a.size();j++)
        {
            if(min>a.get(j)-a.get(j-1))min=a.get(j)-a.get(j-1);
        }
        ans[0]=min;
        return ans;
    }
}