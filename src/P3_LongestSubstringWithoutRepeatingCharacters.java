import java.util.HashMap;

public class P3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int longest = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        for (char c : s.toCharArray()) {
            if (map.containsKey(c))
                start = Math.max(start, map.get(c) + 1);
            map.put(c, i++);
            longest = Math.max(longest, i - start);
        }

        return longest;
    }

    public static void main(String[] args) {
        P3_LongestSubstringWithoutRepeatingCharacters p = new P3_LongestSubstringWithoutRepeatingCharacters();
        System.out.println(p.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(p.lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(p.lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println(p.lengthOfLongestSubstring("abba")); // 2
    }

}
