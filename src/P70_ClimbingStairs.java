public class P70_ClimbingStairs {

    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

//    public int climbStairs(int n) {
//        int total = 0;
//        for (int twos = 0; twos <= n / 2; twos++) {
//            total += choose(n - twos, twos);
//            System.out.println(choose(n - twos, twos));
//        }
//        return total;
//    }
//
//    public int choose(int n, int r) {
//        if (n - r > r) r = n - r;
//        BigInteger result = BigInteger.valueOf(1);
//        for (int i = n; i > r; i--) result = result.multiply(BigInteger.valueOf(i));
//        for (int i = n - r; i > 1; i--) result = result.divide(BigInteger.valueOf(i));
//        return result.intValue();
//    }

}
