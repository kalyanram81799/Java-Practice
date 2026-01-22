public class InstanceVariableDemo {

    int age;        // default = 0
    String name;    // default = null

    public static void main(String[] args) {
        InstanceVariableDemo obj = new InstanceVariableDemo();
        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}
