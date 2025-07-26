public class Array1 {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 7, 6, 5, 4, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}
