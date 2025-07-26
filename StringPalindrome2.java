public class StringPalindrome2 {

    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    static boolean isPalindrome(String s) {
        if (s.equals(reverse(s))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "newyorkcity";
        System.out.println(isPalindrome(s));
    }
}
