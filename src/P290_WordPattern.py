class Solution:
  def wordPattern(self, pattern: str, s: str) -> bool:
    words: dict = {}
    s = s.split()
    if len(pattern) != len(s):
      return False
    for i, c in enumerate(pattern):
      if c in words.keys():
        if words[c] != s[i]:
          return False
      elif s[i] in words.values():
        return False
      else:
        words[c] = s[i]
    return True