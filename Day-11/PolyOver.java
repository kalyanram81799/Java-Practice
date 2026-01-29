class A{
     public void show(){
        System.out.println("in parent class");
     }
}
class B extends A{
     public void show(){
        System.out.println("in child class");
     }
}
public class PolyOver{
    public static void main(String[] args) {
        System.out.println("in main method");
        A a=new B();
        a.show();
    }
}