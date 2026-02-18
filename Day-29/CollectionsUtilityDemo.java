import java.util.*;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(10);
        list.add(30);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);
    }
}
