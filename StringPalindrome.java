public class StringPalindrome {
    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        // s = s.toLowerCase();
        s = s.toLowerCase();
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Level";
        System.out.println(isPalindrome(s));
    }
}
