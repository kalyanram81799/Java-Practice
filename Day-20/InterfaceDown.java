interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }

    void eat() {
        System.out.println("Dog eats");
    }
}

public class InterfaceDown {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();

        Dog d = (Dog) a;
        d.eat();
    }
}