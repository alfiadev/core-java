import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("enter numbers");

        while (s.hasNextInt()) {

            int x = s.nextInt();
            list.add(x);
        }
        /*
         * System.out.println(list);
         * 
         * ListIterator<Integer> li = list.listIterator();
         * while (li.hasNext()) {
         * System.out.println(li.next());
         * }
         * System.out.println();
         * while (li.hasPrevious()) {
         * System.out.println(li.previous());
         * 
         * }
         */
        for (int v : list) {
            System.out.println(v);
        }

    }
}
