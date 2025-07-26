public class IntToString {
    static String convertString(int num) {
        if (num == 0)
            return "0";

        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int digit = num % 10;
            char ch = (char) ('0' + digit);
            sb.append(ch);
            num = num / 10;
        }
        if (isNegative) {
            sb.append('-');
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        int num = 1234;
        String res = convertString(num);
        System.out.println(res);

    }
}