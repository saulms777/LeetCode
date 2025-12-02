public class P203_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        while (head.val == val) {
            head = head.next;
            if (head == null) return null;
        }

        ListNode current = head;
        while (current != null) {
            if (current.next == null) return head;
            if (current.next.val == val)
                current.next = current.next.next;
            if (current.next == null || current.next.val != val)
                current = current.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
    }

}
