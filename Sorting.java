public class Sorting {
    public static void main(String[] args) {
        int[] goals = { 775, 886, 444, 111, 77, 9 };
        for (int i = 1; i < goals.length; i++) {
            for (int j = i + 1; j < goals.length; j++) {
                if (goals[i] > goals[j]) {
                    int temp;
                    temp = goals[i];
                    goals[i] = goals[j];
                    goals[j] = temp;

                }
            }

        }
        for (int i = 1; i < goals.length; i++) {
            System.out.println(goals[i]);
        }
    }
}
