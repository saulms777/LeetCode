import java.util.Map;
import static java.util.Map.entry;
import java.util.Stack;

public class P20_ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> matching = Map.ofEntries(
                entry(')', '('),
                entry(']', '['),
                entry('}', '{')
        );
        Stack<Character> brackets = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                brackets.push(c);
            else if (brackets.size() != 0 && matching.get(c) == brackets.peek())
                brackets.pop();
            else return false;
        }
        return brackets.size() == 0;
    }

}
