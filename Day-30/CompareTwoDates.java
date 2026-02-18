import java.time.LocalDate;

public class CompareTwoDates {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(2025, 5, 10);
        LocalDate d2 = LocalDate.of(2026, 5, 10);

        if (d1.isBefore(d2)) {
            System.out.println("d1 is before d2");
        }

        if (d2.isAfter(d1)) {
            System.out.println("d2 is after d1");
        }
    }
}
