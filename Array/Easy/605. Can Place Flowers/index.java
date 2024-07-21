class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        /**
         * Runtime: 1 ms
         * Memory: 45.8 MB
         * Explain: Check 0 0 0 and first index and last index
         */
        if (n == 0)
            return true;

        int length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {
        // Example 1
        int[] flowerbed1 = { 1, 0, 0, 0, 1 };
        int n1 = 1;
        boolean result1 = canPlaceFlowers(flowerbed1, n1);
        System.out.println(result1);

        // Example 2
        int[] flowerbed2 = { 1, 0, 0, 0, 1 };
        int n2 = 2;
        boolean result2 = canPlaceFlowers(flowerbed2, n2);
        System.out.println(result2);

        // Example 3
        int[] flowerbed3 = { 1, 0, 1, 0, 0, 1 };
        int n3 = 1;
        boolean result3 = canPlaceFlowers(flowerbed3, n3);
        System.out.println(result3);
    }

}