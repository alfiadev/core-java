import java.util.Scanner;

public class PrimePair3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter element");
        int ele = s.nextInt();
        int[] arr = new int[ele];

        System.out.println("enter" + ele + "numbers");
        for (int i = 0; i < ele; i++) {
            arr[i] = s.nextInt();
        }
        // int[] arr = { 5, 7, 3, 9, 2, 4 };
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isIPrime = checkPrime(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                boolean isJPrime = checkPrime(arr[j]);
                if (isIPrime || isJPrime) {
                    count++;
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
