public  class StaticDemo {
    static private  int x=10;
    public static void main(String args[]){
        StaticDemo sd=new StaticDemo();
        StaticDemo sd1=new StaticDemo();
        System.out.println(sd.x);
        sd1.x=100;
        System.out.println(sd1.x);
        System.out.println(StaticDemo.x);
    }
}
