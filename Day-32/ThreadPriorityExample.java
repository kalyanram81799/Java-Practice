class PriorityThread extends Thread {
    public void run() {
        System.out.println(
            Thread.currentThread().getName() +
            " Priority: " +
            Thread.currentThread().getPriority()
        );
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}