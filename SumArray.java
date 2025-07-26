public class SumArray {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = { 12, 43, 11, 11, 22, };
        // for (int i = 0; i < arr.length; i++) {
        for (int num : arr)
            sum += num;
        System.out.println(sum);
        // }
    }
}
