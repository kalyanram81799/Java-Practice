
class Aadhaar {
    private final  String number;

    public Aadhaar(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Aadhaar a = new Aadhaar("1234-5678-9012");
        System.out.println(a.getNumber());
    }
}
