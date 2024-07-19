import java.util.Arrays;

class Solution {
    public static int[] leftRightDifference(int[] nums) {
        /**
         * - Run Time: 2 ms
         * - Memory: 44.8 MB
         */
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
            rightSum[n - 1 - i] = rightSum[n - i] + nums[n - i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return nums;
    }

    public static int[] leftRightDifference2(int[] nums) {
        /**
         * - Run Time: 2 ms
         * - Memory: 44.3 MB
         */
        int[] answer = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            // Loop 1: rightSum - 10 = 15
            // Loop 2: rightSum - 4 = 11
            // Loop 3: rightSum - 8 = 3
            // Loop 4: rightSum - 3 = 0
            rightSum -= nums[i];

            // Loop 1: rightSum = 15, leftSum = 0
            // Loop 2: rightSum = 11, leftSum = 10
            // Loop 3: rightSum = 3, leftSum = 14
            // Loop 3: rightSum = 0, leftSum = 22
            answer[i] = Math.abs(leftSum - rightSum);

            // Loop 1: leftSum + 10 = 10
            // Loop 2: leftSum + 4 = 14
            // Loop 3: leftSum + 8 = 22
            // Loop 4: leftSum + 3 = 25
            leftSum += nums[i];

        }

        return answer;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 10, 4, 8, 3 };
        int[] result1 = leftRightDifference2(nums1);
        System.out.println(Arrays.toString(result1));

        // Example 2
        int[] nums2 = { 1 };
        int[] result2 = leftRightDifference2(nums2);
        System.out.println(Arrays.toString(result2));
    }

}