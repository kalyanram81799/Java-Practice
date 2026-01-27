class parent{
    int x=10;
    void show(){
        System.out.println("In parent method");
    }
}
class Child extends parent{

}
public class InheritanceTest {
    public static void main(String[] args) {
        Child c=new Child();
        c.x=20;
        c.show();
    }
}
