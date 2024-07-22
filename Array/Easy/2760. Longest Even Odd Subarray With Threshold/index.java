import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int longestAlternatingSubarray1(int[] nums, int threshold) {
        /**
         * Runtime: 8 ms
         * Memory: 44.9 MB
         */
        List<Integer> subArr = new ArrayList<Integer>();

        int length = nums.length;
        int max = 0;

        for (int i = 0; i < length; i++) {
            int size = subArr.size();

            if (nums[i] > threshold) {
                continue;
            }

            if ((size == 0 && nums[i] % 2 == 0)
                    || (size > 0 && subArr.get(size - 1) % 2 != nums[i] % 2)) {
                subArr.add(nums[i]);

                max = Math.max(max, subArr.size());

                if (i == length - 1 || nums[i] % 2 == nums[i + 1] % 2 || nums[i + 1] > threshold) {
                    subArr = new ArrayList<Integer>();
                }
            }
        }

        return max;
    }

    public static int longestAlternatingSubarray2(int[] nums, int threshold) {
        /**
         * Runtime: 5 ms
         * Memory: 45.3 MB
         */
        int length = nums.length;
        int count = 0;
        int max = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] > threshold) {
                continue;
            }

            if (count == 0 && nums[i] % 2 == 0 || count > 0 && (nums[i - 1] % 2 != nums[i] % 2)) {

                count++;

                if (i == length - 1 || nums[i] % 2 == nums[i + 1] % 2 || nums[i + 1] > threshold) {
                    max = Math.max(count, max);
                    count = 0;
                }
            }
        }

        return max;
    }

    public static int longestAlternatingSubarray3(int[] nums, int threshold) {
        /**
         * Runtime: 4 ms
         * Memory: 44.8 MB
         */

        // i - start
        // j - nums[j]
        int n = nums.length, max = 0, i = 0, j = 0, flag = 0;

        while (j < n) {
            if (flag == 0) {
                if (nums[j] % 2 == 0 && nums[j] <= threshold) {
                    i = j;
                    max = Math.max(max, j - i + 1);
                    flag = 1;
                }
            } else if (flag == 1) {
                int x = nums[j - 1], y = nums[j], c = x + y;
                if (c % 2 != 0 && nums[j] <= threshold) {
                    max = Math.max(max, j - i + 1);
                } else {
                    flag = 0;
                    j--;
                }
            }
            j++;
        }

        return max;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 3, 2, 5, 4, 6, 5 };
        int threshold1 = 5;
        int result1 = longestAlternatingSubarray1(nums1, threshold1);
        System.out.println(result1);

        // Example 2
        int[] nums2 = { 1, 2 };
        int threshold2 = 2;
        int result2 = longestAlternatingSubarray1(nums2, threshold2);
        System.out.println(result2);

        // Example 3
        int[] nums3 = { 2, 3, 4, 5 };
        int threshold3 = 4;
        int result3 = longestAlternatingSubarray1(nums3, threshold3);
        System.out.println(result3);

        // Example 4
        int[] nums4 = { 2, 2 };
        int threshold4 = 5;
        int result4 = longestAlternatingSubarray1(nums4, threshold4);
        System.out.println(result4);
    }

}