public class P83_RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == current.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
    }

}