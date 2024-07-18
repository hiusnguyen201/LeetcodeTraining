import java.util.Arrays;

class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int length = n * 2;
        int[] shuffleArr = new int[length];

        for (int i = 0; i < length / 2; i++) {
            shuffleArr[2 * i] = nums[i];
            shuffleArr[2 * i + 1] = nums[n + i];
        }

        return shuffleArr;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int[] result = shuffle(nums, 3);
        System.out.println(Arrays.toString(result));

        // Example 2
        int[] nums2 = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int[] result2 = shuffle(nums2, 4);
        System.out.println(Arrays.toString(result2));

        // Example 3
        int[] nums3 = { 1, 1, 2, 2 };
        int[] result3 = shuffle(nums3, 2);
        System.out.println(Arrays.toString(result3));

        // Run Time: 0 ms
        // Memory: 44.7 MB
    }

}