public class RunnableLambda {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("thread running");
        };
        r.run();
    }

}