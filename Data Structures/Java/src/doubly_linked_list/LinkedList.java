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

    public void remove() {
        if(!isEmpty()) {
            if(size == 1) {
                head = tail = null;
            } else {
                Node<T> newHead = head.getNext();
                newHead.setPrev(null);
                head = newHead;
            }
        }
    }

    public boolean remove(T data) {
        Node<T> next = head;
        int index = 0;
        while (next != null) {
            if(next.getData().equals(data)) {
                if(index == 0)
                    remove();
                else{
                    Node<T> prevNode = next.getPrev();
                    Node<T> nextNode = next.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);
                }
                return true;
            }
            next = next.getNext();
            index++;
        }
        return false;
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

    public void printInReverse() {
        Node<T> next = tail;
        while (next != null) {
            System.out.print(next.getData());
            System.out.print(" ");
            next = next.getPrev();
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
