package op_queuearray;

public class QueueArrayClient {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(4);
        queueArray.enqueue(4);
        queueArray.enqueue(56);
        queueArray.enqueue(2);
        queueArray.enqueue(67);
        queueArray.enqueue(33);
        queueArray.dequeue();
        queueArray.enqueue(34);
        queueArray.enqueue(57);
        queueArray.dequeue();
        queueArray.dequeue();
        queueArray.dequeue();
        queueArray.enqueue(44);
        queueArray.enqueue(55);
        queueArray.enqueue(66);
    }
}
