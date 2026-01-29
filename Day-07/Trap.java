class Trap {
    Trap(String s) {
        System.out.println("String");
    }

    Trap(Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        new Trap(null);
    }
}

