class NumberPrinterThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class TwoThreadsPrintingNumbers {
    public static void main(String[] args) {
        NumberPrinterThread thread1 = new NumberPrinterThread();
        NumberPrinterThread thread2 = new NumberPrinterThread();

        thread1.start();
        thread2.start();
    }
}
