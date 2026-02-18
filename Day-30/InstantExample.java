import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println("Current Timestamp: " + now);

        long epochMilli = now.toEpochMilli();
        System.out.println("Milliseconds since 1970: " + epochMilli);
    }
}
