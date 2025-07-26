public class SumEvenOdd {
    public static void main(String[] args) {
        int arr[] = { 12, 10, 8, 7, 3, 55, 22, 33, 76, 33 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                ;
            sum += arr[i];
            System.out.println(sum);
        }
    }
}
