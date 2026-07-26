public class MyCircularQueue {
    private final int[] data;
    private int front;
    private int count;
    private final int capacity;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.data = new int[k];
        this.front = 0;
        this.count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        int rear = (front + count) % capacity;
        data[rear] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        count--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return data[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        int rear = (front + count - 1) % capacity;
        return data[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}