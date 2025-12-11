import java.util.*;

public class P17_LetterCombinationsOfAPhoneNumber {

    HashMap<Character, List<String>> letters = new HashMap<>();
    {
        letters.put('2', Arrays.asList("a", "b", "c"));
        letters.put('3', Arrays.asList("d", "e", "f"));
        letters.put('4', Arrays.asList("g", "h", "i"));
        letters.put('5', Arrays.asList("j", "k", "l"));
        letters.put('6', Arrays.asList("m", "n", "o"));
        letters.put('7', Arrays.asList("p", "q", "r", "s"));
        letters.put('8', Arrays.asList("t", "u", "v"));
        letters.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 1) return letters.get(digits.charAt(0));
        List<String> result = new ArrayList<>();
        for (String l : letters.get(digits.charAt(0)))
            for (String r : letterCombinations(digits.substring(1)))
                result.add(l + r);
        return result;
    }

    public static void main(String[] args) {
        P17_LetterCombinationsOfAPhoneNumber p = new P17_LetterCombinationsOfAPhoneNumber();
        System.out.println(p.letterCombinations("23"));
        System.out.println(p.letterCombinations("2"));
    }

}
