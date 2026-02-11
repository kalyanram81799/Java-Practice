class Alpha {
    public void show() {
        System.err.println("stsrted at alpha");
        System.out.println("in alpha class");
    }
}

class Beta extends Alpha {
    void display() {
        System.out.println("started at beta ");
        show();
    }
}

public class TightExtends {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.display();
        Alpha a = new Beta();
        a.show();
    }
}