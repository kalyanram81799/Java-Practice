class WorkerThread extends Thread {
    public void run() {
        System.out.println("Worker started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Worker finished");
    }
}

public class MultipleJoinExample {
    public static void main(String[] args) throws InterruptedException {
        WorkerThread t1 = new WorkerThread();
        WorkerThread t2 = new WorkerThread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main finished");
    }
}