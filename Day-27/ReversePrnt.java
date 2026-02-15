import java.util.*;
public class ReversePrnt{
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("eneter the size of array");
        int size=S.nextInt();
        System.out.println("enter array elements");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = S.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("Forward printing :"+arr[i]);
        }
        System.out.println("*********************");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("reverse printing :"+arr[i]);
        }
    }
}