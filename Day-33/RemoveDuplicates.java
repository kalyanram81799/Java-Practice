import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);

        List<Integer> result = list.stream()
                .distinct()
                .toList();

        System.out.println(result);
    }
}