public class P171_ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        char[] str = columnTitle.toCharArray();
        int num = 0;
        int power = 0;
        for (int i = str.length - 1; i >= 0; i--)
            num += Math.pow(26, power++) * (str[i] - 'A' + 1);
        return num;
    }

}
