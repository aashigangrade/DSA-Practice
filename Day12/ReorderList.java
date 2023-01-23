class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }//slow is preMid

        ListNode preMid = slow;
        ListNode cur = slow.next;//cur is mid
        while (cur.next != null) {
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = preMid.next;
            preMid.next = next;
        }

        ListNode p1 = head;
        ListNode p2 = preMid.next;

        while (p1 != preMid) {
            preMid.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMid.next;
        }
    }
}