//constructor injection
interface Flight {
    void book();
}

class FirstFlight implements Flight {
    public void book() {
        System.out.println("booking ticket in first flight");
    }
}

class Amazon {
    Flight flight;

    Amazon(Flight flight) {
        this.flight = flight;
    }

    void deliver() {
        flight.book();
        System.out.println("Delivery done");
    }
}

public class TestConstructorDI {
    public static void main(String[] args) {
        Flight f = new FirstFlight();
        Amazon a = new Amazon(f); // IoC
        a.deliver();
    }
}