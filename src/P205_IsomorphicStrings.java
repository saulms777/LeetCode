import java.util.*;

public class P205_IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] sl = new int[s.length()];
        int[] tl = new int[t.length()];
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for (int i = 0, id = 0; i < s.length(); i++, id++) {
            char sc = s.charAt(i);
            if (!smap.containsKey(sc)) {
                smap.put(sc, id);
                sl[i] = id;
            }
            else sl[i] = smap.get(sc);

            char tc = t.charAt(i);
            if (!tmap.containsKey(tc)) {
                tmap.put(tc, id);
                tl[i] = id;
            }
            else tl[i] = tmap.get(tc);
        }
        return Arrays.equals(sl, tl);
    }

}
