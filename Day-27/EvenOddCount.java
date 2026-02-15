public class EvenOddCount {
    public static void main(String[] args) {

        int[] arr = {10, 15, 22, 33, 40};

        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}
