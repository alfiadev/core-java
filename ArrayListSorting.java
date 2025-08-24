import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
   public static void main(String[] args) {
    ArrayList<Integer> number= new ArrayList();
    number.add(40);
    number.add(20);
    number.add(3);
    number.add(12);
    number.add(100);

    Collections.sort(number);
    System.out.println(number);

    //after Reversed sorting()
    Collections.sort(number ,Collections.reverseOrder());
    System.out.println(number);
   } 
}
