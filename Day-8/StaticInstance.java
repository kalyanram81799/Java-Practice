class Sample
{
    static int x=10;
    int y=100;
}
public class StaticInstance {
    
     public static void main(String[] args) {
         Sample s1=new Sample();
         s1.x=100;
         s1.y=200;
         System.out.println(s1.x+":"+s1.y);

     }
}
