class Rules1 {
    int x = 10;
    static int y = 20;
    
    
    static void show() {
        System.out.println(y);
        // System.out.println(x); // WHY ERROR?
    }
}
public class Rules{
  public static void main(String[] args){
    Rules1 r=new Rules1();
    r.show();
  }
}
