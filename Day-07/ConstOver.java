public class ConstOver {
   public ConstOver(){
        System.out.println("I am a default constructor");
   }
   public ConstOver(int value)
   {
    System.out.println("I am one integer type Constructor and value is :"+value);
   }
   public ConstOver(String Value)
   {
    System.out.println("I am String Type constructor and name is:"+ Value);
   }
   public ConstOver(int value,String name){
    System.out.println("I am Both int and string valued the value and name is :"+value + ":" +name);
   }
    public static void main(String[] args) {
        new ConstOver();
        new ConstOver(11);
        new ConstOver("kalyan");
        new ConstOver(11,"kalyan");
        new ConstOver(5,"Ram");
    }
}
