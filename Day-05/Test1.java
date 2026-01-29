
    class Test1 {

    void show(int a) {
        System.out.println("int");
    }

    void show(int... a) {
        System.out.println("var-args");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.show(10);
        t.show(10, 20, 30);
    }
}


