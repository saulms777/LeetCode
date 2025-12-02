public class P125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9')
                sb.append(c);
            else if ('A' <= c && c <= 'Z')
                sb.append((char) (c + 32));
            else if ('a' <= c && c <= 'z')
                sb.append(c);
        }
        char[] chars = sb.toString().toCharArray();
        boolean palindrome = true;
        int length = chars.length;
        for (int i = 0; i < (length + 1) / 2; i++)
            palindrome &= chars[i] == chars[length - i - 1];
        return palindrome;
    }

}
