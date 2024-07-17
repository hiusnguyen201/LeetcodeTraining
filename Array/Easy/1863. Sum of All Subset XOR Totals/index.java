class Solution {
    public static int subsetXORSum(int[] nums) {
        int length = nums.length;
        int result = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {

                System.out.print(nums[i] + "\t" + nums[j]);

                System.out.println();
            }
            System.out.println();
        }

        return result;
    }

    public static void main(String args[]) {
        // Example 1
        // int[] nums1 = { 1, 3 };
        // int result1 = subsetXORSum(nums1);
        // System.out.println(result1);

        // Example 2
        // int[] nums2 = { 5, 1, 6 };
        // int result2 = subsetXORSum(nums2);
        // System.out.println(result2);

        // Example 3
        int[] nums3 = { 3, 4, 5, 6, 7, 8 };
        int result3 = subsetXORSum(nums3);
        // System.out.println(result3);

        // Run Time: 1 ms
        // Memory: 40.9 MB
    }

}