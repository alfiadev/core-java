public class ArrayPairSum {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 2, 1, };
        int k = 6;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }

        }
    }
}
