import java.util.ArrayDeque;
import java.util.Deque;

public class Solution150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.length() == 1 && "+-*/".contains(token)) {
                int right = stack.pop();
                int left = stack.pop();
                switch (token.charAt(0)) {
                    case '+': stack.push(left + right); break;
                    case '-': stack.push(left - right); break;
                    case '*': stack.push(left * right); break;
                    default: stack.push(left / right);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
