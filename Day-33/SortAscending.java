import java.util.*;
import java.util.stream.Collectors;
public class SortAscending {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,55,67);
        List<Integer>result=list.stream()
        .sorted()
        .collect(Collectors.toList());
       System.out.println(result);
    }
}
