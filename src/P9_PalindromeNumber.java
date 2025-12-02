public class P9_PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        int i = 0;
        int[] stack = new int[5];
        int size = (int) Math.log10(x) + 1;
        while (i < size / 2) {
            stack[i] = x % 10;
            x /= 10;
            i++;
        }
        if (size % 2 == 1) {
            x /= 10;
            i++;
        }
        while (i < size) {
            if (x % 10 != stack[size - i - 1]) return false;
            x /= 10;
            i++;
        }
        return true;
    }

}
