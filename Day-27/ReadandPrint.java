import java.util.*;
public class ReadandPrint {
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int size=sc.nextInt();
        int[] arr=new int[size]; 
        System.out.println("enter the array elements:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("entered array elements are:");
        for(i=0;i<size;i++){
            System.out.println("index :"+i + " " " +value:"+arr[i]);
        }
    }
}
