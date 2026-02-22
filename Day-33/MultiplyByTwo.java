import java.util.*;
import java.util.stream.*;

public class MultiplyByTwo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> result =
            list.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}