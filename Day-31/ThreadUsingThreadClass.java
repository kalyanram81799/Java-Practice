class SimpleThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadUsingThreadClass {
    public static void main(String[] args) {
        SimpleThread thread = new SimpleThread();
        thread.start();
    }
}
