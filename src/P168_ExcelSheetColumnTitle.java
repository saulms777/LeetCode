public class P168_ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while (columnNumber > 0) {
            title.append((char) ((columnNumber - 1) % 26 + 'A'));
            columnNumber -= (columnNumber - 1) % 26 + 1;
            columnNumber /= 26;
        }
        return title.reverse().toString();
    }

}
