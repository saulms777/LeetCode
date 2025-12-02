import java.util.HashMap;

public class P13_RomanToInteger {

    public int romanToInt(String s) {
        final HashMap<Character, Integer> symbols = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int length = s.length();

        int total = 0;
        int i = 0;
        while (i < length) {
            int num = symbols.get(s.charAt(i));

            if (i < length - 1) {
                int next = symbols.get(s.charAt(i + 1));
                if (next > num) {
                    total += next - num;
                    i += 2;
                    continue;
                }
            }
            total += num;
            i++;
        }

        return total;
    }

}
