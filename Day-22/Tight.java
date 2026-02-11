class Alpha {
    public void show() {
        System.out.println("In Alpha class");
    }
}

class Beta {
    public void show() {
        System.out.println("In Beta class");
        Alpha a = new Alpha();
        a.show();
    }
}

public class Tight {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.show();
    }
}