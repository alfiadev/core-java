import java.util.Scanner;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("not devided by zero");
        }
        return a / b;
    }

}

class ClaculatorApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculator calc = new Calculator();
        double num1, num2, result = 0;
        char operator;

        while (true) {
            System.out.println("Enter First Number");
            num1 = s.nextDouble();

            System.out.println("enter operator (+,*,/,-) or press q or Q");
            operator = s.next().charAt(0);
            if (operator == 'q' || operator == 'Q') {
                System.out.println("exit calculator");
                break;
            }
            System.out.println("enter second number");
            num2 = s.nextDouble();

            try {
                switch (operator) {
                    case '+':
                        result = calc.add(num1, num2);
                        break;
                    case '-':
                        result = calc.subtract(num1, num2);
                        break;
                    case '/':
                        result = calc.div(num1, num2);
                        break;
                    case '*':
                        result = calc.multiplication(num1, num2);
                        break;
                }
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}