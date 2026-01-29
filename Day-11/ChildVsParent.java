class Parent1{
     public void show(){
        System.out.println("in parent class");
     }
}
class Child1 extends Parent1{
     public void show(){
        System.out.println("in child class"); 
     }
}
public class ChildVsParent{
    public static void main(String[] args) {
        Parent1 p=new Child1();
        p.show();
        Child1 c=new Child1();
        c.show();
    }
}