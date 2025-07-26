public class Except {
    public static void main(String[] args) {
        // throw new ArithmeticException();
        // System.out.println(10 / 0);
        System.out.println("hello");
        m1();

    }

    public static void m1() {
        m2();
        // System.out.println(10 / 0);
    }

    public static void m2() throws ArithmeticException {
        System.out.println(10 / 0);
        System.out.println("hi");
    }

}
