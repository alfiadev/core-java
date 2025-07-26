import java.io.InterruptedIOException;

public class Throwss {
    public static void main(String[] args) throws InterruptedException {
        doStuff();

    }

    public static void doStuff() throws InterruptedException {
        doMoreStuff();
        System.out.println("hello newyork");
    }

    public static void doMoreStuff() throws InterruptedException {
        Thread.sleep(1000);
        /*
         * try {
         * Thread.sleep(1000);
         * } catch (InterruptedException e) {
         * e.printStackTrace();
         * }
         * System.out.println("heyy");
         */
    }
}
