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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode k = new ListNode(0);
        ListNode temp = k;
        BigInteger n = new BigInteger("0"),l =new BigInteger("0");
         int i = 0, j = 0;
         String q="";
        while (l1 != null) {
           q = Integer.toString(l1.val) + q;
            n = new BigInteger(q);
            l1 = l1.next;
            i++;
        }
        q="";
        while (l2 != null) {
            q = Integer.toString(l2.val) + q;
            l = new BigInteger(q);
            l2 = l2.next;
            j++;
        }
        n=n.add(l);
        String s=n.toString();
        ListNode aa = new ListNode(0);
        temp = aa;
        for(int f=s.length()-1;f>=0;f--){
            temp.next = new ListNode(Character.getNumericValue(s.charAt(f)));
            temp= temp.next;
        }
             

        return aa.next;
    }
}