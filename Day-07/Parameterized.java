


public class Parameterized {
    public Parameterized(int value,String name)
    {
        System.out.println("Parameterized consturctor in java");
        System.out.println("Roll no is "+value+";" +"Name is "+name);
    }
    public static void main(String[] args) {
    new Parameterized(11,"Kalyan");
    // Parameterized p =new Parameterized(0, null);
    }
}
