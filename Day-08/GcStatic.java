class GcStatic {
    static GcStatic d;

    public static void main(String[] args) {
        d = new GcStatic();
        d = null;

        System.out.println("End");
    }
}
