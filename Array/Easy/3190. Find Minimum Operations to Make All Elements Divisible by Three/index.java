class Solution {
    public static int numIdenticalPairs(int[] nums) {
        int length = nums.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 1, 2, 3, 1, 1, 3 };
        int count1 = numIdenticalPairs(nums1);
        System.out.println(count1);

        // Example 2
        int[] nums2 = { 1, 1, 1, 1 };
        int count2 = numIdenticalPairs(nums2);
        System.out.println(count2);

        // Example 3
        int[] nums3 = { 1, 2, 3 };
        int count3 = numIdenticalPairs(nums3);
        System.out.println(count3);

        // Run Time: 1 ms
        // Memory: 40.9 MB
    }

}