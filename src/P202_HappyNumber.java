public class P202_HappyNumber {

    public boolean isHappy(int n) {
        int turtle = n;
        int hare = n;
        do {
            turtle = squareSum(turtle);
            hare = squareSum(squareSum(hare));
            if (turtle == 1 || hare == 1) return true;
        } while (turtle != hare);
        return false;
    }

    public int squareSum(int n) {
        int total = 0;
        while (n != 0) {
            total += Math.pow(n % 10, 2);
            n /= 10;
        }
        return total;
    }

}
