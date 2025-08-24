import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMaxMinValues {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        int max= Collections.max(list);
        int min= Collections.min(list);
        System.out.println("MAX"+max+  "  " +"MIN"+min);

        Iterator<Integer> itr= list.iterator();
        int max1=list.get(0);
         int min2=list.get(0);


        while(itr.hasNext()){
            int num=itr.next();
            if(num>min2 &&num<max1){
            System.out.println(num);
            }
        }

    }
}
