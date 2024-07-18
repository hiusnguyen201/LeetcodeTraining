import java.util.Arrays;

class Solution {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];

        for (int i = 1; i < n; i++) {
            result[i] = nums[i] + result[i - 1];
        }

        return result;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 1, 2, 3, 4 };
        int[] result1 = runningSum(nums1);
        System.out.println(Arrays.toString(result1));

        // Example 2
        int[] nums2 = { 1, 1, 1, 1, 1 };
        int[] result2 = runningSum(nums2);
        System.out.println(Arrays.toString(result2));

        // Example 3
        int[] nums3 = { 3, 1, 2, 10, 1 };
        int[] result3 = runningSum(nums3);
        System.out.println(Arrays.toString(result3));

        // Run Time: 0 ms
        // Memory: 42.5 MB
    }

}