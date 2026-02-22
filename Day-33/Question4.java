import java.util.*;
import java.util.stream.*;

public class Question4 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "apple", "banana", "apple",
                "orange", "banana", "apple"
        );

        Map<String, Long> frequency =
                list.stream()
                    .collect(Collectors.groupingBy(
                            s -> s,
                            Collectors.counting()
                    ));

        System.out.println(frequency);
    }
}