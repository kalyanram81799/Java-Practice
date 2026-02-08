interface Marker {
}

class Demo implements Marker {
}

public class Markerss {
    public static void main(String[] args) {
        Demo d = new Demo();

        if (d instanceof Marker) {
            System.out.println("Marker interface implemented");
        }
    }
}
