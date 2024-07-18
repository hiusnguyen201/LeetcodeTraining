import java.util.Arrays;
import java.util.List;

class Solution {
    public static int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums.get(i) + nums.get(j)) < target) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String args[]) {
        /**
         * - Run Time: 2 ms
         * - Memory: 42.2 MB
         */
        // Example 1
        List<Integer> nums1 = Arrays.asList(-1, 1, 2, 3, 1);
        int target1 = 2;
        int result1 = countPairs(nums1, target1);
        System.out.println(result1);

        // Example 2
        List<Integer> nums2 = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        int target2 = -2;
        int result2 = countPairs(nums2, target2);
        System.out.println(result2);

        // Other solution is can sort the list
        // and use loop to find the result sum then the num
        // satify the condition will be in left array
    }

}