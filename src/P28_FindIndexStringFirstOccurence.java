public class P28_FindIndexStringFirstOccurence {

    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        int i = 0;
        while (i <= haystackLength - needleLength) {
            if (haystack.substring(i, i + needleLength).equals(needle))
                return i;
            i++;
        }
        return -1;
    }

}
