import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveURL {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter URL");

    String s = scan.nextLine();
    removeURLs (s);
   } 

   static void removeURLs(String s){
     String[] ar=s.split(",");
     TreeSet <String> set= new TreeSet<String>(new MyCompareURL());
     for(int i =0;i<ar.length;i++){
       set.add(ar[i].trim().toLowerCase());
     }
     for(String str:set){
      System.out.println(str);
     }
   }

 
  
}
class MyCompareURL implements Comparator<String>{
   public int compare(String u1, String u2){
       
          return u2.compareTo(u1);
   
      
}
}
