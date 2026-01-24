
 class MainOverLoad {

    public static void main(String[] args) {
        System.out.println("Original main");
        main(10);
        main("Java");
    }

    public static void main(int a) {
        System.out.println("int main");
    }

    public static void main(String s) {
        System.out.println("String main");
    }
}
