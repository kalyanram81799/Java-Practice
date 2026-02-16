public class StringPerformanceTest {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 20; i++) {
            s += "a";
        }

        System.out.println(s);
        long endTime = System.currentTimeMillis();
        System.out.println("String Time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sb.append("a");
        }
        System.out.println(s);
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime));
    }
}
