import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountCharacter {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s= scan.nextLine();
       reArrange(s);
   }

   static String reArrange(String s){
     String t="";
      LinkedHashMap <Character,Integer>  map= new LinkedHashMap<Character,Integer>();
      for(int i = 0;i<s.length();i++){
        char ch= s.charAt(i);
        if (map.containsKey(ch)){
            Integer v= map.get(ch);
            map.put(ch ,v+1);
        }
        else{
            map.put(ch ,1);
        }
    }
        Set<Entry<Character,Integer>> entrys = map.entrySet();
    
        for(Entry<Character,Integer> e : entrys){

           
            t=t+e.getKey()+e.getValue();
        }
        
      
      return t;
   }

}



