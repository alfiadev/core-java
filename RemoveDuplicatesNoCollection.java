import java.util.Arrays;

public class RemoveDuplicatesNoCollection {

    static int[] removeDuplicates(int[] arr) {

        System.out.println("Test");

        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[k++] = arr[i];
            }

        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 4, 3, 2, 6, 7, 3 };

        int[] res = removeDuplicates(arr);

        System.out.println("without duplicate");

        for (int num : res) {
            System.out.println(num + " ");
        }
    }
}
