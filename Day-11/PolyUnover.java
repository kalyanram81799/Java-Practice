class Parent{
    public void show(){
      System.out.println("in Parent Show"); 
    }
}
class Child extends Parent{
    
}
class PolyUnover{
    public static void main(String[] args) {
        Parent p=new Child();
        p.show();
    }
}