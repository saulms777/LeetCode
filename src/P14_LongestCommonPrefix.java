import java.util.*;
import java.util.stream.Stream;

public class P14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int shortest = Stream.of(strs).map(String::length).min(Integer::compareTo).get();
        for (int i = 0; i < shortest; i++) {
            List<Character> sameChars = new LinkedList<>();
            for (String s : strs)
                sameChars.add(s.charAt(i));

            Set<Character> uniques = new HashSet<>(sameChars);
            if (uniques.size() == 1)
                sb.append(uniques.toArray()[0]);
            else break;
        }
        return sb.toString();
    }

}
