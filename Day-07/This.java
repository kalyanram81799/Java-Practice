
class This {
    int x;

    This(int x) {
        this.x = x;  // resolves shadowing
    }

    public static void main(String[] args) {
        This e = new This(10);
        System.out.println(e.x);
    }
}
