import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListModifications{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
     
        list .add("banana");
        list.add("apple");
        list.add("mango");
        list.add("berries");

     /*    System.out.println(list.get(1));
        System.out.println(list.indexOf("mango"));
       boolean hasMango= list.contains("mango");
       System.out.println(hasMango);
       list.set(1,"CHerry");

       Iterator itr = list.iterator();
       while(itr.hasNext()){
         System.out.println(itr.next());
       }*/
      ListIterator itr = list.listIterator();
      while(itr.hasNext()){
         
       // Object fruit =itr.next();

      //  if(fruit.equals("mango")){
            // itr.remove();
           //  System.out.println(fruit);
        //}
        if(itr.next().equals("mango")){
            itr.remove();
        }
       
      } 
      
       System.out.println(list);


        

        list.clear();
        System.out.println(list);

        list .add("banana");
        list.add("apple");
        list.add("mango");
        list.add("berries");

        list.set(0,"kiwi");
        System.out.println(list);
        list.add(0,"grapes");
        System.out.println(list);










    }
}
