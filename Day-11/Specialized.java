class A{
    void show(){
        System.out.println("In parent class");
    }
}
class B extends A{
    void show(){
        System.out.println("in child class");
    }
    void specializeD(){
        System.out.println("in chid specialized");
    }
}
public class Specialized
{
    public static void main(String[] args) {
        A a=new B();
        a.show();
    // if (a instanceof B) {

    // //     B b=(B)a;
    // // b.specializeD();
    // }
     }
}
