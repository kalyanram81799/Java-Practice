interface Utils {
    static void show() {
        System.out.println("Static method in interface");
    }
}

public class StaticInter {
    public static void main(String[] args) {
        Utils.show();
    }
}
