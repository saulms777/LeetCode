from collections import deque

class Solution:
    def simplifyPath(self, path: str) -> str:
        st = deque()
        for s in path.split('/'):
            if not s or s == '.':
                continue
            if s == '..':
                if st:
                    st.pop()
            else:
                st.append(s)
        return '/' + '/'.join(st)