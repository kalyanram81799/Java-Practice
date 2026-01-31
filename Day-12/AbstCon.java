class Vehicles{
    Vehicles(){
        System.out.println("The vehicle constructor");

    }
}
class Bike extends Vehicles{
    Bike(){
        System.out.println("The bike constructor");
    }
    void start() {
        System.out.println("The bike starts by kick");
    }
}
class AbstCon{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}