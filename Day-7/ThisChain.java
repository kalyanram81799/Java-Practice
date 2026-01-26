class ThisChain {
    ThisChain() {
        // this(10);
        System.out.println("Default");
    }

    ThisChain(int x) {
        this();
        System.out.println("Param: " + x);
    }

    public static void main(String[] args) {
        new ThisChain(10);
    }
}
