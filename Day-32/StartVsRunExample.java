class DemoThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class StartVsRunExample {
    public static void main(String[] args) {
        DemoThread t = new DemoThread();

        t.run(); // Normal method call
        t.start(); // Real thread creation
    }
}