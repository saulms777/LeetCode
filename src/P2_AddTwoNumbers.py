# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1: ListNode | None, l2: ListNode | None) -> ListNode | None:
        return self.atn(l1, l2, 0)
    
    def atn(self, l1, l2, c):
        if l1 and l2:
            s = l1.val + l2.val + c
            return ListNode(s % 10, self.atn(l1.next, l2.next, s // 10))
        if l1:
            s = l1.val + c
            return ListNode(s % 10, self.atn(l1.next, None, s // 10))
        if l2:
            s = l2.val + c
            return ListNode(s % 10, self.atn(None, l2.next, s // 10))
        return ListNode(c) if c else None