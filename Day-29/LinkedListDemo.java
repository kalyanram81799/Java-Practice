import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);

        System.out.println("LinkedList: " + list);

        list.removeFirst();
        list.add(2, 45);
        System.out.println("After removing  first and adding element: " + list);
    }
}
