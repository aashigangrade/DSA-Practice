public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0, len2 = 0;
        ListNode temp1 = headA;
        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }
        temp1 = headB;
        while (temp1 != null) {
            len2++;
            temp1 = temp1.next;
        }
        int dif = Math.abs(len1 - len2);
        if (len1 > len2) {
            while (dif-- > 0) headA = headA.next;
        } else while (dif-- > 0) headB = headB.next;
        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}