import java.util.*;

public class HashMapBasicDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "C++"); // overwrite

        System.out.println("Map: " + map);
        System.out.println("Value of key 2: " + map.get(2));
    }
}
