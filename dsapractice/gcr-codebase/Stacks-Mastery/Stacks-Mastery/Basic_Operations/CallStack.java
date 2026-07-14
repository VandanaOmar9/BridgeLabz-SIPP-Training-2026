public class CallStack {
    private static class Frame {
        private final String functionName;
        private final Frame next;

        Frame(String functionName, Frame next) {
            this.functionName = functionName;
            this.next = next;
        }
    }

    private Frame top;

    public void push(String functionName) { top = new Frame(functionName, top); }

    public String pop() {
        if (isEmpty()) throw new IllegalStateException("No active call to return from");
        String functionName = top.functionName;
        top = top.next;
        return functionName;
    }

    public String peek() {
        if (isEmpty()) throw new IllegalStateException("No active calls");
        return top.functionName;
    }

    public boolean isEmpty() { return top == null; }
}
