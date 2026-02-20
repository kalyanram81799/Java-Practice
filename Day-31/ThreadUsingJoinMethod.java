class ChildThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class ThreadUsingJoinMethod {
    public static void main(String[] args) throws InterruptedException {
        ChildThreadExample childThread = new ChildThreadExample();
        childThread.start();

        childThread.join(); // Main waits until child finishes

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
