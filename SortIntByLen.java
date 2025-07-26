public class SortIntByLen {
    public static void main(String[] args) {
        int[] nums = { 111, 2, 2333, 22, 1, 33333 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (Integer.toString(nums[j]).length() > Integer.toString(nums[j + 1]).length()) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                } else if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            for (int num : nums) {
                System.out.println(num);
            }

        }
    }
}
