import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<Boolean>();

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, candies[i]);
        }

        for (int i = 0; i < n; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }

    public static void main(String args[]) {
        /**
         * - Run Time: 1 ms
         * - Memory: 42.4 MB
         */
        // Example 1
        int[] candies1 = { 2, 3, 5, 1, 3 };
        int extraCandies1 = 3;
        List<Boolean> result1 = kidsWithCandies(candies1, extraCandies1);
        System.out.println(result1);

        // Example 2
        int[] candies2 = { 4, 2, 1, 1, 2 };
        int extraCandies2 = 1;
        List<Boolean> result2 = kidsWithCandies(candies2, extraCandies2);
        System.out.println(result2);

        // Example 3
        int[] candies3 = { 12, 1, 12 };
        int extraCandies3 = 10;
        List<Boolean> result3 = kidsWithCandies(candies3, extraCandies3);
        System.out.println(result3);
    }

}