class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int length = operations.length;
        int x = 0;
        for (int i = 0; i < length; i++) {
            // Use ASCII
            x += (int) (44 - operations[i].charAt(1));
            System.out.println(x);
        }

        return x;
    }

    public static void main(String args[]) {
        // Example 1
        String[] operations = { "--X", "X++", "X++" };
        int result = finalValueAfterOperations(operations);
        System.out.println(result);

        // Example 2
        String[] operations2 = { "++X", "++X", "X++" };
        int result2 = finalValueAfterOperations(operations2);
        System.out.println(result2);

        // Example 3
        String[] operations3 = { "X++", "++X", "--X", "X--" };
        int result3 = finalValueAfterOperations(operations3);
        System.out.println(result3);

        // Run Time: 30 ms
        // Memory: 44 MB
    }

}