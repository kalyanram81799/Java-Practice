import java.util.*;

public class Question3 {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        Integer sum =
                list.stream()
                    .flatMap(l -> l.stream())  // flatten
                    .filter(x -> x % 2 == 0)   // even numbers
                    .reduce(0, Integer::sum);  // sum

        System.out.println(sum);
    }
}