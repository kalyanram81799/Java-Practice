import java.time.LocalDate;

public class LocalDateImmutabilityExample {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Before: " + date);

        date = date.plusDays(10); // now assigned

        System.out.println("After: " + date);

        date = date.plusDays(10);
        System.out.println("After Proper Assignment: " + date);
    }
}
