class SleepExampleThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadUsingSleepMethod {
    public static void main(String[] args) {
        SleepExampleThread thread = new SleepExampleThread();
        thread.start();
    }
}
