public class P69_Sqrtx {

    public int mySqrt(int x) {
        // babylonian method
        long a = x;
        long b = 1;
        while (a - b > 0) {
            a = (a + b) / 2;
            b = x / a;
        }
        return (int) a;
    }

}
