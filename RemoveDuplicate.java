import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicate {

    static String removeDuplicates(String s) {
        // HashSet<Character> lk = new HashSet<Character>();
        // LinkedHashSet<Character> lk = new LinkedHashSet<Character>();
        TreeSet<Character> lk = new TreeSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lk.add(ch);
        }
        String st = "";
        for (char x : lk) {
            st = st + x;
        }
        return st;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String res = removeDuplicates(s);
        System.out.println(res);
    }
}
