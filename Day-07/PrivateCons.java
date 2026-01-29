class PrivateCons {
    private PrivateCons() {
        System.out.println("Private");
    }
    public static void main(String[] args) {
        new PrivateCons();
    }
}