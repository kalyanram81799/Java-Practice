import java.util.*;
public class CountGreaterThan10{
    public static void main(String[] args) {
     List<Integer> list = Arrays.asList(5, 12, 18, 3, 20);
     long count =
            list.stream()
                .filter(x -> x > 10)
                .count();

        System.out.println(count);
    
    }
}
