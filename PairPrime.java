public class PairPrime {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = { 2, 3, 6, 7, 4, 5 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (checkPrime(arr[i]) || checkPrime(arr[j])) {
                    count++;

                }
                System.out.println(arr[i] + " " + arr[j]);
            }

        }

    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
