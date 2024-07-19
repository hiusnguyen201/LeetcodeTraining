import java.util.ArrayList;
import java.util.List;

class Solution {
    public static boolean canBeIncreasing(int[] nums) {
        /**
         * Runtime: 182 ms
         * Memory: 45.3 MB
         */
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            List<Integer> sliceArr = new ArrayList<Integer>();

            for (int j = 0; j < n - 1; j++) {
                sliceArr.add(i <= j ? nums[j + 1] : nums[j]);
                if (sliceArr.size() > 1 && sliceArr.get(j - 1) < sliceArr.get(j)) {
                    count++;
                }
            }

            if (count == sliceArr.size() - 1) {
                return true;
            }
        }

        return false;
    }

    public static boolean canBeIncreasing2(int[] nums) {
        /**
         * Runtime: 0 ms
         * Memory: 42.4 MB
         */
        int n = nums.length;
        int count = 0;
        int p = 0;

        // Count nums[i] > nums[j + 1] and mark it
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                count++;
                p = i;
            }
        }

        if (count > 1) {
            return false;
        } else {
            // Check p is the first or last index alway true
            if (p == 0 || p == n - 2)
                return true;
            // Check nums[p] with 2 case
            // Case 1: check nums[p - 1] > nums[p + 1]
            // Case 2: check nums[p + 2] > nums[p]
            if (nums[p + 1] > nums[p - 1] || nums[p + 2] > nums[p])
                return true;
            return false;

        }
    }

    public static void main(String args[]) {
        // Example 1
        /**
         * Explain:
         * - n = 5
         * - First loop will get: p = 2, count = 1
         * - (count > 1) => next
         * - (p == 0 || p == n-2) => next
         * - (numsp[p + 1] > nums[p - 1] || nums[p + 2] > nums[p])
         * => First condition is true
         */
        int[] nums1 = { 1, 2, 10, 5, 7 };
        boolean result1 = canBeIncreasing2(nums1);
        System.out.println(result1);

        // Example 2
        int[] nums2 = { 2, 3, 1, 2 };
        boolean result2 = canBeIncreasing2(nums2);
        System.out.println(result2);

        // Example 3
        int[] nums3 = { 1, 1, 1 };
        boolean result3 = canBeIncreasing2(nums3);
        System.out.println(result3);

        // Run Time: 1 ms
        // Memory: 40.9 MB
    }

}