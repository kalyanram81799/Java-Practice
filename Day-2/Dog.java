class Dog {

    String name;
    String color;

    void bark() {
        System.out.println("Dog is barking");
    }

    void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Rocky";
        dog1.color = "Brown";

        dog1.bark();
        dog1.eat();
    }
}
