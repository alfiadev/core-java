import java.util.Scanner;

public class CustomizedException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age");
        int age = s.nextInt();
        // int age = Integer.parseInt(args[0]);
        if (age < 18) {
            throw new TooYoungException("you are too young  for marriage");
        } else if (age > 60) {
            throw new TooOldException("you are too old for marriage ");
        } else {
            System.out.println("thanks for your regestration");
        }

    }
}

class TooYoungException extends RuntimeException {
    TooYoungException(String msg) {
        super(msg);
    }
}

class TooOldException extends RuntimeException {
    TooOldException(String msg) {
        super(msg);
    }
}
