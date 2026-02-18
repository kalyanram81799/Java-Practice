import java.util.Date;

public class DateMutabilityExample {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println("Before Change: " + d);

        d.setTime(0);   // changing internal state

        System.out.println("After Change: " + d);
    }
}
