import java.util.Stack;

public class P234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        Stack<Integer> p = new Stack<>();
        for (int i = 0; i < size / 2; i++) {
            p.add(head.val);
            head = head.next;
        }
        if (size % 2 == 1) head = head.next;
        for (int i = 0; i < size / 2; i++) {
            if (p.pop() != head.val) return false;
            head = head.next;
        }
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;
    }

}
