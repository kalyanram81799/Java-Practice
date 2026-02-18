import java.util.*;

public class FailFastDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i : list) {
            // list.add(4); // Causes ConcurrentModificationException
            System.out.println(i);
        }
    }
}
