import java.util.Scanner;
import java.util.TreeSet;

public class DuplicateNumber {
    static int[] removeDuplicates(int[] arr) {
        // HashSet<Character> lk = new HashSet<Character>();
        // LinkedHashSet<Character> lk = new LinkedHashSet<Character>();
        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int[] res = removeDuplicates(arr);

        System.out.println("sorted without duplicate");

        // for (int i = 0; i < res.length; i++) {
        // System.out.println(res[i]);
        // }
        for (int num : res) {
            System.out.println(num);
        }

    }
}
