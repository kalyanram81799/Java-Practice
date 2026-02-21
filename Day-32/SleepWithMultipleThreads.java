class SleepThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SleepWithMultipleThreads {
    public static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        SleepThread t2 = new SleepThread();

        t2.start();
        t1.start();
    }
}