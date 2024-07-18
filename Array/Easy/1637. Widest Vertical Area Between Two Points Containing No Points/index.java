import java.util.Arrays;

class Solution {
    public static int maxWidthOfVerticalArea1(int[][] points) {
        int n = points.length;
        int max = 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n - 1; i++) {
            int width = points[i + 1][0] - points[i][0];
            max = Math.max(max, width);
        }

        return max;
    }

    public static void main(String args[]) {
        /**
         * Solution1
         */
        // Example 1
        int[][] points1 = { { 8, 7 }, { 9, 9 }, { 7, 4 }, { 9, 7 } };
        int result1 = maxWidthOfVerticalArea1(points1);
        System.out.println(result1);

        // Example 2
        int[][] points2 = { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } };
        int result2 = maxWidthOfVerticalArea1(points2);
        System.out.println(result2);

        // Run Time: 39 ms
        // Memory: 72.9 MB
    }

}