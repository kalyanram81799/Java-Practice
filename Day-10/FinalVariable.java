import java.util.Scanner;
class A{

 final int x=01;
 
 A(){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no :");
//   x=sc.nextInt();error if uncomment 
System.out.println("the value of x:"+x);
 }
}



public class FinalVariable{
    public static void main(String[] args)
    {
              A a=new A();
    }
}