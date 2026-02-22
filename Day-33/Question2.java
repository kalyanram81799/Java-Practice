import java.util.*;

public class Question2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 50, 30, 40);

        Integer secondHighest =
                list.stream()
                    .sorted((a,b) -> b - a)  // descending
                    .skip(1)                 // skip highest
                    .findFirst()
                    .get();

        System.out.println(secondHighest);
    }
}