public class StringChar {
    public static void main(String[] args) {
        String s = " How are you ";
        int wordCount = countWord(s);
        System.out.println(wordCount);
    }

    public static int countWord(String s) {
        // String s = " How are you ";
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        if (s.charAt(0) == ' ') {
            return count;
        } else {
            return count + 1;
        }
        // return s.charAt(0) == ' ' ? count : count + 1;
    }
}
