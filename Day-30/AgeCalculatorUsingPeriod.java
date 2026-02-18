import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorUsingPeriod {
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(2005, 9, 06);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Years: " + age.getYears());
        System.out.println("Months: " + age.getMonths());
        System.out.println("Days: " + age.getDays());
    }
}
