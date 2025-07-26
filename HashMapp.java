import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("india", 10000);
        map.put("China", 60000);
        map.put("USA", 90000);
        map.put("Australia", 1000);
        map.put("newzealand", 20000);

        /*
         * System.out.println(map);
         * Set<Map.Entry<String, Integer>> entrys = map.entrySet();
         * for (Map.Entry<String, Integer> e : entrys) {
         * System.out.println(e.getKey() + " " + e.getValue());
         * }
         */

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + "  : " + value);
        }
    }
}