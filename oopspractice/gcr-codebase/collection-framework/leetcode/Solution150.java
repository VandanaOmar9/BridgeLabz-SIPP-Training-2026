import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            if ("+-*/".contains(s)) {
                int b = st.pop(), a = st.pop();
                if (s.equals("+")) st.push(a + b);
                else if (s.equals("-")) st.push(a - b);
                else if (s.equals("*")) st.push(a * b);
                else st.push(a / b);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}