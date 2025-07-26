public class RevString {
    static String reverse(String s) {
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {
        String s = "ilovemymom";
        System.out.println(reverse(s));
    }
}