import java.util.*;

public class FindFirstGreater {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,12,18,3,20);

        Optional<Integer> result =
            list.stream()
                .filter(x -> x > 15)
                .findFirst();

        System.out.println(result.get());
    }
}