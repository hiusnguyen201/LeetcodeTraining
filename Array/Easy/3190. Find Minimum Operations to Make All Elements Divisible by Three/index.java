class Solution {
    public static int minimumOperations(int[] nums) {
        int length = nums.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] % 3 != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 1, 2, 3, 4 };
        int count1 = minimumOperations(nums1);
        System.out.println(count1);

        // Example 2
        int[] nums2 = { 3, 6, 9 };
        int count2 = minimumOperations(nums2);
        System.out.println(count2);

        // Run Time: 0 ms
        // Memory: 41.5 MB
    }

}