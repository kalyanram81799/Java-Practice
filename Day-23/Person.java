public class Person {
    String name = "Kalyan";

    class Phone {
        void display() {
            System.out.println("Owner: " + name);
        }
    }
        public static void main(String[] args) {
        Person p = new Person();
        Person.Phone ph = p.new Phone();
        ph.display();
    }
}
