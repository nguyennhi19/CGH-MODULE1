package MyQueue;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enQueue(4);
        queue.dequeue();
        queue.enQueue(56);
        queue.enQueue(2);
        queue.enQueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enQueue(24);
        queue.dequeue();
        queue.enQueue(98);
        queue.enQueue(45);
        queue.enQueue(23);
        queue.enQueue(435);
    }
}
