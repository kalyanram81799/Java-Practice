interface Vehicle {
    void start();
    void stop();
}

abstract class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

class Honda extends Car {
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class PartialInter {
    public static void main(String[] args) {
        Vehicle v = new Honda();
        v.start();
        v.stop();
    }
}
