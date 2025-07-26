import java.util.LinkedHashSet;
import java.util.Scanner;

public class DupString22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            // System.out.println(set);
        }
        System.out.println(set);
    }
}