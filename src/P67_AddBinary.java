public class P67_AddBinary {

    public String addBinary(String a, String b) {
        int length = Math.max(a.length(), b.length()) + 1;

        boolean[] binA = new boolean[length];
        int i = 0;
        for (char c : a.toCharArray())
            binA[length - a.length() + i++] = c == '1';

        boolean[] binB = new boolean[length];
        i = 0;
        for (char c : b.toCharArray())
            binB[length - b.length() + i++] = c == '1';

        boolean[] binSum = new boolean[length];
        boolean carry = false;
        for (i = length - 1; i >= 0; i--) {
            binSum[i] = binA[i] ^ binB[i] ^ carry;
            carry = carry ? (binA[i] || binB[i]) : (binA[i] && binB[i]);
        }

        StringBuilder s = new StringBuilder();
        for (boolean bool : binSum)
            s.append(bool ? '1' : '0');
        if (s.charAt(0) == '0')
            s.deleteCharAt(0);

        return s.toString();
    }

}
