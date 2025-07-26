import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHndle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter numerator:");
            int a = s.nextInt();

            try {
                System.out.println("Enter denominator:");
                int b = s.nextInt();
                int result = a / b;
                System.out.println("Result: " + result);

                System.out.println(" Invalid denominator");
            } catch (InputMismatchException e) {
                System.out.println("Invalid numerator");
            } finally {
                System.out.println("hii");
            }
            System.out.println("will this print");

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}