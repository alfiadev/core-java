public class Finaly1 {
    public static void main(String[] args) {
        try {
            System.out.println("heyyy");
            try {
                System.out.println("inner try block");
                // System.out.println(10 / 0);
            } catch (NullPointerException e) {
                System.out.println(e.toString());
            }
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
