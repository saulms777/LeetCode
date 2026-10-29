# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: ListNode | None) -> bool:
        try:
            fast = head.next
            while fast is not head:
                head = head.next
                fast = fast.next.next
            return True
        except:
            return False