/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int over = 0;
        while(l1 != null || l2!=null || over != 0)
        {
            cur.next = new ListNode(0);
            cur = cur.next;
            if(l1 != null)
            {
                over+=l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                over+=l2.val;
                l2 = l2.next;
            }
            cur.val = over%10;
            over = over/10;
            
        }
        return res.next;
    }
}