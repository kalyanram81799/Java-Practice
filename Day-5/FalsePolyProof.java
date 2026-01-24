
class FalsePolyProof {

    void display(int a) {
        System.out.println("int method");
    }

    void display(double a) {
        System.out.println("double method");
    }

    public static void main(String[] args) {
        FalsePolyProof t = new FalsePolyProof();
        t.display(10);
        t.display(10.5);
    }
}
