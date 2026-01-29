class Aeroplane {
    void takeOff() {
        System.out.println("Aeroplane takeoff");
    }

    void land() {
        System.out.println("Aeroplane landing");
    }
}

class CargoPlane extends Aeroplane {
    void land() {
        System.out.println("CargoPlane landing");
    }
}

public class OverUnover {
    public static void main(String[] args) {
        Aeroplane a = new CargoPlane();
        a.takeOff();
        a.land();
    }
}
