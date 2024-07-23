import java.util.Arrays;

class Solution {
    public static int missingInteger(int[] nums) {
        /**
         * Runtime: 1 ms
         * Memory: 42.4 MB
         */
        int countSum = nums[0], n = nums.length;
        // nums[0] is the start
        // Find longest sequential
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] + 1 == nums[i])
                countSum += nums[i];
            else
                break;
        }

        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (countSum == nums[i]) {
                countSum++;
            }
        }

        return countSum;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 1, 2, 3, 2, 5 };
        int result1 = missingInteger(nums1);
        System.out.println(result1);

        // Example 2
        int[] nums2 = { 3, 4, 5, 1, 12, 14, 13 };
        int result2 = missingInteger(nums2);
        System.out.println(result2);

        // Example 3
        int[] nums3 = { 4, 5, 6, 7, 8, 8, 9, 4, 3, 2, 7 };
        int result3 = missingInteger(nums3);
        System.out.println(result3);

        // Example 4
        int[] nums4 = { 37, 1, 2, 9, 5, 8, 5, 2, 9, 4 };
        int result4 = missingInteger(nums4);
        System.out.println(result4);

        // Example 5
        int[] nums5 = { 28, 29 };
        int result5 = missingInteger(nums5);
        System.out.println(result5);
    }

}