import java.util.*;
import java.util.stream.*;

public class Question5 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 3);

        // Check if all even
        boolean allEven = list.stream()
                .allMatch(x -> x % 2 == 0);

        System.out.println(allEven);

        // Partition even and odd
        Map<Boolean, List<Integer>> partition = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(partition);
    }
}