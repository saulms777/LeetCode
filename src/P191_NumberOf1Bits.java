public class P191_NumberOf1Bits {

    public int hammingWeight(int n) {
        int weight = 0;
        for (int i = 0; i < 32; i++)
            weight += (n >> i) & 1;
        return weight;
    }

}
