import java.util.ArrayDeque;
import java.util.Deque;

public class ValidConfig {
    public boolean isValidConfig(String brackets) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty() || !matches(stack.pop(), bracket)) return false;
            } else {
                throw new IllegalArgumentException("Input must contain only brackets");
            }
        }
        return stack.isEmpty();
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
