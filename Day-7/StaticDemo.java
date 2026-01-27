class StaticDemo {
    static {
        System.out.println("Static block");
    }

    StaticDemo() {
        System.out.println("Constructor ");
    }

    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
    }
}
