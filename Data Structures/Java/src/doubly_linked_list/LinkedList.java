package doubly_linked_list;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    private void addFirstElement(T data) {
        head = tail = new Node<>(data);
    }

    public void addFirst(T data) {
        if(isEmpty())
            addFirstElement(data);
        else {
            Node<T> newNode = new Node<>(data);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        if(isEmpty())
            addFirstElement(data);
        else {
            Node<T> newNode = new Node<>(data);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void print() {
        Node<T> next = head;
        while (next != null) {
            System.out.print(next.getData());
            System.out.print(" ");
            next = next.getNext();
        }
        System.out.print("\n");
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public int size() {
        return size;
    }
}
