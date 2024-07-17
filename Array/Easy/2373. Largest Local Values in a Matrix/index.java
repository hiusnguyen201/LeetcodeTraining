import java.util.Arrays;

class Solution {
    public static int[][] largestLocal(int[][] grid) {
        int gridLength = grid.length;
        int[][] result = new int[gridLength - 2][gridLength - 2];

        for (int i = 1; i < gridLength - 1; i++) {
            for (int j = 1; j < gridLength - 1; j++) {
                int temp = 0;

                for (int k = i - 1; k <= i + 1; ++k) {
                    for (int m = j - 1; m <= j + 1; ++m) {
                        temp = grid[k][m] > temp ? grid[k][m] : temp;
                    }
                }

                result[i - 1][j - 1] = temp;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        // Example 1
        int[][] grid1 = {
                { 9, 9, 8, 1 },
                { 5, 6, 2, 6 },
                { 8, 2, 6, 4 },
                { 6, 2, 2, 2 } };
        int[][] result1 = largestLocal(grid1);
        System.out.println(Arrays.deepToString(result1));

        // Example 2
        int[][] grid2 = {
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 2, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };
        int[][] result2 = largestLocal(grid2);
        System.out.println(Arrays.deepToString(result2));

        // Run Time: 3 ms
        // Memory: 45.5 MB
    }

}