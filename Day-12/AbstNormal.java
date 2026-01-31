abstract  class Bank{
    abstract int intrestrate();
    void display(){
        System.out.println("in Bank class");
    }
}
class Sbi extends Bank{
    int intrestrate(){
        System.out.println("The intrest is "+7);
        return 7;
    }
}
public class AbstNormal{
    public static void main(String[] args) {
        Bank s=new Sbi();
        s.display();
        System.out.println(s.intrestrate());
    }
}