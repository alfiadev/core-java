public class StringSpace {
    public static void main(String[] args) {
        int count = 0;
        String s = "  how  are  you ";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                count++;

            }
        }
        System.out.println(count);

    }
}
