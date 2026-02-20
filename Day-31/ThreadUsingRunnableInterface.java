class SimpleRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread is executing...");
    }
}

public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        SimpleRunnable task = new SimpleRunnable();
        Thread thread = new Thread(task);
        thread.start();
    }
}
