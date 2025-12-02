public class P2_AddTwoNumbers {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int total = l1.val + l2.val;
        l1 = l1.next;
        l2 = l2.next;

        ListNode sum = new ListNode(total % 10);
        ListNode current = sum;
        int carryOver = total / 10;

        while (l1 != null || l2 != null) {
            current.next = new ListNode();
            current = current.next;

            total = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carryOver;
            current.val = total % 10;
            carryOver = total / 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carryOver > 0)
            current.next = new ListNode(carryOver);

        return sum;
    }

}
