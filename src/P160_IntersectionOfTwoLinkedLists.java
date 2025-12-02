public class P160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while (!(a == null && b == null)) {
            if (a == b) return a;
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return null;
    }

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashMap<ListNode, ListNode> table = new HashMap<>();
//        while (!(headA == null && headB == null)) {
//            table.put(headA, headB);
//            if (table.containsKey(headB))
//                return headB;
//            if (table.containsValue(headA))
//                return headA;
//
//            if (headA != null)
//                headA = headA.next;
//            if (headB != null)
//                headB = headB.next;
//        }
//        return null;
//    }

    public static class ListNode {
        int val;
        ListNode next;
    }

}
