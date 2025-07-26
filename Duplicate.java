import java.util.LinkedHashSet;

public class Duplicate {
    public static void main(String[] args) {
        String str = "missippiss";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);

        }
        for (char c : set) {
            result.append(c);
            // System.out.println(result);

        }
        System.out.println(result);
    }
}
