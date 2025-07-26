public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("heyyy");
            // System.out.println(10 / 0);
            System.out.println("try");
        } catch (ArithmeticException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally block");
        }
    }
}
