public class PalindromeString {
    public static void main(String[] args) {
        String str = "Racecar";
        str = str.toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);

        }
        if (str.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
