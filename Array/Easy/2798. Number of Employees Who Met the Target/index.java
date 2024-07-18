import java.util.Arrays;

class Solution {
    public static int numberOfEmployeesWhoMetTarget1(int[] hours, int target) {
        int length = hours.length;
        Arrays.sort(hours);

        if (hours[length - 1] < target) {
            return 0;
        }

        for (int i = 0; i < length; i++) {
            if (hours[i] >= target) {
                return length - i;
            }
        }

        return 0;
    }

    public static int numberOfEmployeesWhoMetTarget2(int[] hours, int target) {
        int length = hours.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        /**
         * First Solution:
         * - Run Time: 2 ms
         * - Memory: 42.4 MB
         */
        // Example 1
        int[] hours1 = { 0, 1, 2, 3, 4 };
        int target1 = 2;
        int result1 = numberOfEmployeesWhoMetTarget1(hours1, target1);
        System.out.println(result1);

        // Example 2
        int[] hours2 = { 5, 1, 4, 2, 2 };
        int target2 = 6;
        int result2 = numberOfEmployeesWhoMetTarget1(hours2, target2);
        System.out.println(result2);

        /**
         * Second Solution:
         * - Run Time: 0 ms
         * - Memory: 42.8 MB
         */

        // Example 1
        int[] hours3 = { 0, 1, 2, 3, 4 };
        int target3 = 2;
        int result3 = numberOfEmployeesWhoMetTarget2(hours3, target3);
        System.out.println(result3);

        // Example 2
        int[] hours4 = { 5, 1, 4, 2, 2 };
        int target4 = 6;
        int result4 = numberOfEmployeesWhoMetTarget2(hours4, target4);
        System.out.println(result4);

    }

}