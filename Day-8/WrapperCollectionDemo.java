import java.util.*;
public class WrapperCollectionDemo{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        for(Integer i:list)
        {
            System.out.println(i);
        }
        }
}