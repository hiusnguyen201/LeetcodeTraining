import java.util.Arrays;

class Solution {
    public static int missingInteger(int[] nums) {
        int maxLength = 1, start = 0, end = 0, numsLength = nums.length, currLength = 1;

        // Find longest sequential
        for (int i = 1; i < numsLength; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                currLength++;
                if (currLength > maxLength) {
                    maxLength = currLength;
                    start = i - maxLength + 1;
                    end = i;
                }
            } else {
                maxLength = 1;
                currLength = 1;
            }
        }

        // Sum of longest sequential
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }

        Arrays.sort(nums);
        int j = 0;
        while (j != numsLength) {
            if (nums[j] == sum) {
                sum++;
            }
            j++;
        }

        return sum;
    }

    public static void main(String args[]) {
        // // Example 1
        // int[] nums1 = { 1, 2, 3, 2, 5 };
        // int result1 = missingInteger(nums1);
        // System.out.println(result1);

        // // Example 2
        // int[] nums2 = { 3, 4, 5, 1, 12, 14, 13 };
        // int result2 = missingInteger(nums2);
        // System.out.println(result2);

        // Example 3
        int[] nums3 = { 4, 5, 6, 7, 8, 8, 9, 4, 3, 2, 7 };
        int result3 = missingInteger(nums3);
        // System.out.println(result3);
    }

}