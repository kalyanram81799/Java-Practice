class AmbiguityInMo {

    void show(int a, double b) {
        System.out.println("int double");
    }

    void show(double a, int b) {
        System.out.println("double int");
    }

    public static void main(String[] args) {
        AmbiguityInMo t = new AmbiguityInMo();
        t.show(10, 20);   //  ERROR
    }
}
