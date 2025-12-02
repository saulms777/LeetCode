public class P141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode node = head.next;
        while (true) {
            if (head == null || node == null)
                return false;
            if (head == node)
                return true;
            if (node.next == null)
                return false;

            head = head.next;
            node = node.next.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
    }

}
