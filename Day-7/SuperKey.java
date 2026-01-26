class SuperKey {
    SuperKey() {
        System.out.println("Parent constructor");
    }
}

class Child extends SuperKey {
    Child() {
        super();
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
