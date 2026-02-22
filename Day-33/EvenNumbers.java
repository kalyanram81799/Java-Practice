import java.util.*;
public class EvenNumbers{
    public static void main(String args[]){
        List<Integer> li=Arrays.asList(10, 15, 20, 25, 30);
        li.stream().filter(i->i%2==0).forEach(System.out::println);
    }
}