import java.util.Arrays;

class Solution {
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i])
                    continue;
                if (nums[j] < nums[i])
                    count++;
            }
            result[i] = count;
        }

        return result;
    }

    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int n = nums.length;
        int[] buck = new int[101]; // 101 - constraint

        // Count occurrences of nums[i] and store in 'buck' by index
        for (int i = 0; i < n; i++) {
            buck[nums[i]] += 1;
        }

        // Accumulate counts in buck[] to get the ending position of each number
        for (int i = 1; i <= 100; i++) {
            buck[i] += buck[i - 1];
        }

        // Map each element in nums[i] to its correct position using buck[]
        for (int i = 0; i < n; i++) {
            int pos = nums[i];
            nums[i] = pos == 0 ? 0 : buck[pos - 1];
        }

        return nums;

        // Run Time: 1 ms
        // Memory: 44.4 MB
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 8, 1, 2, 2, 3 };
        int[] result1 = smallerNumbersThanCurrent2(nums1);
        System.out.println(Arrays.toString(result1));

        // Example 2
        // int[] nums2 = { 6, 5, 4, 8 };
        // int[] result2 = smallerNumbersThanCurrent1(nums2);
        // System.out.println(Arrays.toString(result2));

        // Example 3
        // int[] nums3 = { 7, 7, 7, 7 };
        // int[] result3 = smallerNumbersThanCurrent1(nums3);
        // System.out.println(Arrays.toString(result3));

        // Run Time: 12 ms
        // Memory: 44.8 MB
    }

}