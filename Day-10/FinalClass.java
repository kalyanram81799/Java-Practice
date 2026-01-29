final class One{
    public void show(){
        System.out.println("in final class");
    }
}
// class Two extends One{
// }error if uncomment this
public class FinalClass{
    public static void main(String[] args){
        One o=new One();
        o.show();
    }
}