abstract class One{
        abstract void show();
}
abstract class Two extends One{

}
class Three extends Two{
    void show(){
        System.out.println("show");
    }
}
class NotImplemen{
    public static void main(String[] args) {
        Two t=new Three();
        t.show();

    }
}