class Animal{
    void animal(){
        System.out.println("in animal method");
    }
}
class Dog extends Animal
    {
       void dog (){
           System.out.println("in dog method");
    }
}
     class Fox extends Animal
    {
       void fox (){
           System.out.println("in fox method");
    }
}
     
     class Cat extends Animal
    {
       void cat (){
           System.out.println("in cat method");
    }
}

class Multiple{
    public static void main(String[] args) {
        Dog d=new Dog();
        
        d.dog();
        d.animal();
        Fox f=new Fox();
        f.fox();
        f.animal();
        Cat c= new Cat();
        c.cat();
        c.animal();

    }
}
