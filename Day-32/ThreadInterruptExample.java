class InterruptThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Running: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}

public class ThreadInterruptExample {
    public static void main(String[] args) throws InterruptedException {
        InterruptThread t = new InterruptThread();
        t.start();

        Thread.sleep(2000); // Main waits 2 seconds
        t.interrupt(); // Interrupt child thread
    }
}