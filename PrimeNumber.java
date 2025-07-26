import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.println("enter a number");
        // int n = s.nextInt();
        int n = 4;
        int count = 0;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                count++;
                break;

            }
        }
        if (count == 0 && n > 1) {
            System.out.println(n + "number is  prime");
        } else {
            System.out.println(n + " " + "number is not prime");
        }
    }
}
