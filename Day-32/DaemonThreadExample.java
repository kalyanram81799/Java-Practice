class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon running...");
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();
        t.setDaemon(true);
        t.start();

        System.out.println("Main finished");
    }
}