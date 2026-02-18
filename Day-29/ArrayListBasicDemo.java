import java.util.*;

public class ArrayListBasicDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // duplicate allowed

        System.out.println("List: " + list);
        System.out.println("Element at index 1: " + list.get(1));

        list.remove("C++");
        list.add(3, "Basic");

        System.out.println("After removal: " + list);
    }
}
