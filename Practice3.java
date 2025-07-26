import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class Practice3 {
    public static void main(String[] args) {
        TreeSet<Integer> lst = new TreeSet<Integer>();
        // HashSet<Integer> lst = new HashSet();
        // ArrayList<Integer> lst = new ArrayList<Integer>();

        lst.add(12);
        lst.add(13);
        lst.add(1);
        lst.add(14);
        lst.add(15);
        lst.add(16);
        System.out.println(lst);
        /*
         * ListIterator<Integer> li = lst.listIterator();
         * while (li.hasNext()) {
         * // System.out.println(li.next());
         * if (li.next() == 15) {
         * li.remove();
         * }
         * // li.remove();
         */

    }
    // System.out.println("After removing elements:");
    // System.out.println(lst);

}
