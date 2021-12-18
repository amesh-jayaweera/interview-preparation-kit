package queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        while (queue.size() > 0) {
            System.out.println(queue.dequeue());
        }

    }
}
