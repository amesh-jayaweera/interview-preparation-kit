package doubly_linked_list;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(50);
        list.addFirst(60);
        list.addLast(70);
        list.print();

        // remove head
        list.remove();
        list.print();

        // remove head
        list.remove();
        list.print();

        // remove 20
        list.remove(20);
        list.print();

        list.printInReverse();
    }
}
