public class P12_IntegerToRoman {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        if (num >= 1000) {
            sb.append("M".repeat(num / 1000));
            num %= 1000;
        }
        if (num >= 100) {
            if (num / 100 == 4) sb.append("CD");
            else if (num / 100 == 9) sb.append("CM");
            else sb.append("D".repeat(num / 500)).append("C".repeat((num / 100) % 5));
            num %= 100;
        }
        if (num >= 10) {
            if (num / 10 == 4) sb.append("XL");
            else if (num / 10 == 9) sb.append("XC");
            else sb.append("L".repeat(num / 50)).append("X".repeat((num / 10) % 5));
            num %= 10;
        }
        if (num == 4) sb.append("IV");
        else if (num == 9) sb.append("IX");
        else sb.append("V".repeat(num / 5)).append("I".repeat(num % 5));

        return sb.toString();
    }

    public static void main(String[] args) {
        P12_IntegerToRoman p = new P12_IntegerToRoman();
        System.out.println(p.intToRoman(3999)); // MMMCMXCIX
        System.out.println(p.intToRoman(3749)); // MMMDCCXLIX
        System.out.println(p.intToRoman(3000)); // MMM
        System.out.println(p.intToRoman(1994)); // MCMXCIV
        System.out.println(p.intToRoman(58)); // LVIII
        System.out.println(p.intToRoman(1)); // I
    }

}
