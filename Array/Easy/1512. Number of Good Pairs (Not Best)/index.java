import java.util.Arrays;

class Solution {
    public static int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];

        for (int i = 0; i < length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 0, 2, 1, 5, 3, 4 };
        int[] newArr1 = buildArray(nums1);
        System.out.println(Arrays.toString(newArr1));

        // Example 2
        int[] nums2 = { 5, 0, 1, 2, 3, 4 };
        int[] newArr2 = buildArray(nums2);
        System.out.println(Arrays.toString(newArr2));

        // Run Time: 1 ms
        // Memory: 45.1 MB
    }

}