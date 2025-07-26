import java.util.InputMismatchException;
import java.util.MissingFormatWidthException;
import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Numerator ");
            int a = scan.nextInt();
            System.out.println("Enter the Denominator");
            int b = scan.nextInt();
            int result = a / b;
            System.out.println(result);
            System.out.println("Enter the size of the Array");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter element ");
            int ele = scan.nextInt();
            System.out.println("Enter the index");
            int index = scan.nextInt();
            arr[index] = ele;
            System.out.println(arr[index]);
        } catch (ArithmeticException e) {
            System.out.println("provide non zero Denominator");
        } catch (NegativeArraySizeException n) {
            System.out.println("provide +ve array size");
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("provide valid index");
        } catch (InputMismatchException i) {
            System.out.println("provide only integer");
        }
        System.out.println("connection is terminated");
    }
}