import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadUnsafeSimpleDateFormat {

    static SimpleDateFormat sdf =
            new SimpleDateFormat("yyyyMMddHHmmss");

    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " -> "
                                + sdf.format(new Date())
                );
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
