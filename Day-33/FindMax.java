import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,50,30,90,20);

        Optional<Integer> max =
            list.stream()
                .max(Integer::compareTo);

        System.out.println(max.get());
    }
}