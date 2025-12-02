public class P58_LengthLastWord {

    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean wordFound = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (wordFound) break;
            }
            else {
                length++;
                wordFound = true;
            }
        }
        return length;
    }

}
