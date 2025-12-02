public class P21_MergeTwoSortedLists {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode merged = new ListNode();
        ListNode current = merged;

        while (true) {
            int val1 = (list1 == null ? Integer.MAX_VALUE : list1.val);
            int val2 = (list2 == null ? Integer.MAX_VALUE : list2.val);

            if (val1 <= val2 && list1 != null) {
                current.val = val1;
                list1 = list1.next;
            } else if (val2 < val1) {
                current.val = val2;
                list2 = list2.next;
            } else break;

            if (list1 != null || list2 != null) {
                current.next = new ListNode();
                current = current.next;
            } else break;
        }
        return merged;
    }

}
