import java.util.*;

public class SumUsingReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum =
            list.stream()
                .reduce(0, (a,b) -> a + b);

        System.out.println(sum);
    }
}