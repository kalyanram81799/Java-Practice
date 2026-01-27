public class StaticCon {
    static int show(){
        System.out.println("in static method int");
        return 0;
    }
    static {
        System.out.println("in static block");
    }
    StaticCon(){
        System.out.println("in  Constructor");
    }
    {
        System.out.println("in java instance intialization block ");
    }
    public static void main(String[] args) {
        StaticCon s1=new StaticCon();
        s1.show();
    }
}
