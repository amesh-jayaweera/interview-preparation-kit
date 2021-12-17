public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);
        list.addLast(90);
        list.addLast(100);
        list.print();

        // remove intermediate element
        list.remove(30);
        list.remove(80);
        list.print();

        // remove last element
        list.remove(100);
        list.print();

        // remove first element
        list.remove(10);
        list.print();

        // add elements to first
        list.addFirst(-50);
        list.addFirst(500);
        list.print();

        System.out.println(list.size());
    }
}
