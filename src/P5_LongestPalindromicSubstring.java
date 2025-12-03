public class P5_LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            sb.append(c).append("#");
        sb.deleteCharAt(sb.length() - 1);

        String str = sb.toString();
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            int l = i, r = i;
            while (l > 0 && r < str.length() - 1) {
                if (str.charAt(l - 1) != str.charAt(r + 1)) break;
                l--;
                r++;
            }
            String p = str.substring(l, r + 1).replace("#", "");
            if (p.length() > longest.length())
                longest = p;
        }
        return longest;
    }

    public static void main(String[] args) {
        P5_LongestPalindromicSubstring p = new P5_LongestPalindromicSubstring();
        System.out.println(p.longestPalindrome("babad")); // bab
        System.out.println(p.longestPalindrome("cbbd")); // bb
        System.out.println(p.longestPalindrome("aaaaaaabcbaaaaaa")); // aaaaaabcbaaaaaa
        System.out.println(p.longestPalindrome("a")); // a
        System.out.println(p.longestPalindrome("bb")); // bb
        System.out.println(p.longestPalindrome("abb")); // bb
    }

}
