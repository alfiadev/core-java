public class PrimePair2 {
    public static void main(String[] args) {
        int result = countPrimePairs();
        System.out.println(result);
    }

    public static int countPrimePairs() {
        int count = 0;
        int[] arr = { 2, 4, 5, 8, 9, 5, 7 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (checkPrimePairs(arr[i]) || checkPrimePairs(arr[j])) {
                    count++;
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }

        }
        return count;

    }

    public static boolean checkPrimePairs(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
