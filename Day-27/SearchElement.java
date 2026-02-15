public class SearchElement {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};
        int target = 151;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
