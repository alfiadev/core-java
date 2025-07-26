public class RemoveVowels {
    static String removeVowels(String s) {
        String str = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            } else {
                str = str + ch;
            }

        }
        return str;

    }

    public static void main(String[] args) {
        String s = "nAamMe";
        System.out.println(removeVowels(s));
    }
}
