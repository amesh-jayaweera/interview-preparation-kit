package stack;

import doubly_linked_list.LinkedList;

public class Stack<T> extends LinkedList<T> {

    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T data) {
        list.addFirst(data);
    }

    public T pop() {
        return list.remove();
    }

    @Override
    public int size() {
        return list.size();
    }
}
