import java.math.BigInteger;

public class P8_StringToInteger {

    public int myAtoi(String s) {
        boolean start = false;
        boolean sign = true;
        boolean signed = false;
        BigInteger num = BigInteger.ZERO;
        loop: for (char c : s.toCharArray()) {
            switch (c) {
                case ' ' -> {
                    if (start || signed) break loop;
                }
                case '+' -> {
                    if (start || signed) break loop;
                    signed = true;
                }
                case '-' -> {
                    if (signed) break loop;
                    signed = true;
                    if (start) break loop;
                    else start = true;
                    sign = false;
                }
                case '0' -> {
                    if (num.equals(BigInteger.ZERO)) start = true;
                    num = num.multiply(BigInteger.TEN);
                }
                case '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                    start = true;
                    num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(c - '0'));
                }
                default -> {
                    break loop;
                }
            }
        }

        if (num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            if (sign) return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }
        return sign ? num.intValue() : -num.intValue();
    }

}
