class P {
    P() {
        System.out.println("P");
    }
}

class ImplicitSuper extends P {
    ImplicitSuper() {
        System.out.println("Q");
    }

    public static void main(String[] args) {
        new ImplicitSuper();
    }
}
