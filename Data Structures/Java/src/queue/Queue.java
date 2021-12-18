package queue;

import doubly_linked_list.LinkedList;

public class Queue<T> extends LinkedList<T> {

    private final LinkedList<T> list;

    public Queue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(T data) {
        list.addFirst(data);
    }

    public T dequeue() {
        return list.removeLast();
    }

    @Override
    public int size() {
        return list.size();
    }
}
