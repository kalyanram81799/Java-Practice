interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol engine starts");
    }
}

class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric engine starts");
    }
}

class Car {
    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car(new PetrolEngine());
        c1.drive();

        Car c2 = new Car(new ElectricEngine());
        c2.drive();
    }
}
