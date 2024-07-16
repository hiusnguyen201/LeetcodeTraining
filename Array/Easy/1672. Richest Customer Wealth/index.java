class Solution {
    public static int maximumWealth(int[][] accounts) {
        int length = accounts.length;
        int max = 0;

        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        // Example 1
        int[][] accounts1 = { { 1, 2, 3 }, { 3, 2, 1 } };
        int newArr1 = maximumWealth(accounts1);
        System.out.println(newArr1);

        // Example 2
        int[][] accounts2 = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int newArr2 = maximumWealth(accounts2);
        System.out.println(newArr2);

        // Example 3
        int[][] accounts3 = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int newArr3 = maximumWealth(accounts3);
        System.out.println(newArr3);

        // Run Time: 0 ms
        // Memory: 43 MB
    }

}