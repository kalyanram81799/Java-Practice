import java.util.*;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 9, 3);
        List<Integer> result = list.stream().sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
