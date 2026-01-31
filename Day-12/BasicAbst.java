abstract class Animal{
    void show(){
    };
}
class Dog extends Animal{
    void show(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    void show(){
        System.out.println("Cat is eating");

    }
}
public class BasicAbst
{
        static void call(Animal o)
    {
           o.show();
    }
    public static void main(String args[])
    {
        call(new Cat());
        call(new Dog());
    }
}