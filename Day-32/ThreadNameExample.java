class NameThread extends Thread {
    public void run() {
        System.out.println("Child Thread Name: " + Thread.currentThread().getName());
    }
}

public class ThreadNameExample {
    public static void main(String[] args) {
        NameThread t = new NameThread();
        t.start();
        t.setName("sai");
        System.out.println("Main Thread Name: " + Thread.currentThread().getName());

    }
}