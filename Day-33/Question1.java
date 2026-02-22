import java.util.*;
import java.util.stream.*;

public class Question1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "ant", "banana", "animal", "cat");

        List<String> result =
                list.stream()
                    .map(String::toUpperCase)               // convert to uppercase
                    .filter(s -> s.startsWith("A"))         // filter starting with A
                    .sorted((a,b) -> a.length() - b.length()) // sort by length
                    .collect(Collectors.toList());          // collect to list

        System.out.println(result);
    }
}