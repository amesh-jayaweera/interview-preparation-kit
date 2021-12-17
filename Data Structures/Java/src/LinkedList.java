public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public void addFirst(T data) {
        if(head == null) {
            head = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void addLast(T data) {
        if(head == null) {
            head = new Node<>(data);
        } else {
            Node<T> prev = head;
            Node<T> next = head.getNext();
            while (next != null) {
                prev = next;
                next = next.getNext();
            }
            prev.setNext(new Node<>(data));
        }
    }

    public boolean remove(T data) {
        Node<T> next = head;
        Node<T> prev = null;
        while (next != null) {
            if(next.getData().equals(data)) {
                if(null == prev) {
                    head = next.getNext();
                } else {
                    prev.setNext(next.getNext());
                }
                return true;
            }
            prev = next;
            next = next.getNext();
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node<T> next = head;
        while (next != null) {
            next = next.getNext();
            count++;
        }
        return count;
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

}
