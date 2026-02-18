import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
    public static void main(String[] args) {

        ZonedDateTime indiaTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime usaTime =
                ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("India Time: " + indiaTime);
        System.out.println("USA Time: " + usaTime);
    }
}
