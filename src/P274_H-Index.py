class Solution:
    def hIndex(self, citations: list[int]) -> int:
        citations.sort(reverse=True)
        h = 1
        for n in citations:
            if h <= n:
                h += 1
            else:
                break
        return h - 1