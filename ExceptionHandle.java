public class ExceptionHandle {
    public static void main(String[] args) throws ArithmeticException {
        // doStuff();
        try {
            System.out.println("hello");
            System.out.println(10 / 0);
            System.out.println("my world");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void doStuff() {
        // doMoreStuff();
        // System.out.println(10 / 0);
        // System.out.println("hi");
    }

    public static void doMoreStuff() {
        System.out.println("my world");
        // System.out.println(10 / 0);
    }

}

class Test {
    public static void main(String[] args) {
        throw new ArithmeticException();
        // System.out.println("hi");
    }
}
