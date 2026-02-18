import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
