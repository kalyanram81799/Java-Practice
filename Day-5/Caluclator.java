public class Caluclator{
    void add(int a,int b)
    {
        System.out.println("the addition of " + a + "," + b + (a+b));
    }
     void add(int a,double b)
    {
        System.out.println("the addition of " + a + "," + b + (a+b));
    }
     void add(int a,int b,int c)
    {
        System.out.println("the addition of " + a + "," + b + (a+b));
    }
     void add(int a,int b,double c)
    {
        System.out.println("the addition of " + a + "," + b + (a+b));
    }
    public static void main(String[] args) {
        int x=9,y=8,a=9;
        double z=9.9;
        Caluclator calc = new Caluclator();
        calc.add(x,y);
        calc.add(x,z);
        calc.add(x,y,z);
        calc.add(x,y,a);



        

    }
}