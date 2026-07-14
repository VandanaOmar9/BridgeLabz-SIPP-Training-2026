public class UndoBuffer {
    private final String[] data;
    private int top = -1;

    public UndoBuffer(int maxDepth) {
        if (maxDepth < 0) throw new IllegalArgumentException("maxDepth must be non-negative");
        data = new String[maxDepth];
    }

    public boolean push(String edit) {
        if (isFull()) return false;
        data[++top] = edit;
        return true;
    }

    public String pop() {
        if (isEmpty()) throw new IllegalStateException("Nothing to undo");
        String edit = data[top];
        data[top--] = null;
        return edit;
    }

    public String peek() {
        if (isEmpty()) throw new IllegalStateException("Nothing to undo");
        return data[top];
    }

    public boolean isEmpty() { return top == -1; }
    public boolean isFull() { return top == data.length - 1; }
    public int size() { return top + 1; }
}
