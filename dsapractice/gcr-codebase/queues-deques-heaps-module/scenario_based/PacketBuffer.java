public class PacketBuffer {
    private final int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int packetId) {
        if (count == data.length) return false; // buffer full: reject
        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    public int dequeue() {
        if (count == 0) throw new RuntimeException("Buffer empty");
        int val = data[front];
        front = (front + 1) % data.length;
        count--;
        return val;
    }
}