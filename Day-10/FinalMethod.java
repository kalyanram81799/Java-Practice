class One1{
       protected  final void show(){
                 System.out.println("In final method ");
       }
}
class Two extends One1{
    // public void show(){
    //     System.out.println("in overridden method");
    // } final method cannpot overridden but inherited
}
public class FinalMethod{
    public static void main(String[] args) {
        One1 o=new One1();
        Two t=new Two();
        o.show();
        t.show();
    }
}