public class P7_ReverseInteger {

    public int reverse(int x) {
        if (x == -2147483648) return 0;
        int result = 0;
        boolean pos = x >= 0;
        x = Math.abs(x);
        while (x != 0) {
            if (result > 100_000_000) {
                if (result > 2_147_483_64) return 0;
                if (result == 2_147_483_64 && x > 7 + (pos ? 0 : 1)) return 0;
            }

            result = result * 10 + x % 10;
            x /= 10;
        }
        return pos ? result : -result;
    }

    public static void main(String[] args) {
        P7_ReverseInteger p = new P7_ReverseInteger();
        System.out.println(p.reverse(123)); // 321
        System.out.println(p.reverse(-123)); // -321
        System.out.println(p.reverse(120)); // 21
        System.out.println(p.reverse(0)); // 0
        System.out.println(p.reverse(2147483647)); // 0
        System.out.println(p.reverse(2147483641)); // 1463847412
        System.out.println(p.reverse(-2147483648)); // 0
        System.out.println(p.reverse(-2147483647)); // 0
        System.out.println(p.reverse(-2147483641)); // -1463847412
    }

}
