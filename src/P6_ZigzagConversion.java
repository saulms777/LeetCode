public class P6_ZigzagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) sbs[i] = new StringBuilder();

        int i = 0;
        int b = 0;
        boolean down = false;
        while (i < s.length()) {
            sbs[b].append(s.charAt(i++));
            if (b == 0 || b == numRows - 1) down ^= true;
            if (down) b++;
            else b--;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : sbs) result.append(sb);
        return result.toString();
    }

}
