import java.util.Arrays;

class Solution {
    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];

        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }

        return ans;
    }

    public static void main(String args[]) {
        // Example 1
        int[] nums1 = { 1, 2, 3 };
        int[] newArr1 = getConcatenation(nums1);
        System.out.println(Arrays.toString(newArr1));

        // Example 2
        int[] nums2 = { 1, 3, 2, 1 };
        int[] newArr2 = getConcatenation(nums2);
        System.out.println(Arrays.toString(newArr2));

        // Run Time: 1 ms
        // Memory: 45.2 MB
    }

}