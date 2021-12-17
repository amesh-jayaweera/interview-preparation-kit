public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
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

        System.out.println(list.size());
    }
}
