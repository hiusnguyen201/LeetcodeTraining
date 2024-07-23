class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        /**
         * Runtime: 0 ms
         * Memory: 41.7 MB
         */

        int count = 0, n = stones.length();

        for (int i = 0; i < n; i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        // Example 1
        String jewels1 = "aA", stones1 = "aAAbbbb";
        int result1 = numJewelsInStones(jewels1, stones1);
        System.out.println(result1);

        // Example 2
        String jewels2 = "z", stones2 = "ZZ";
        int result2 = numJewelsInStones(jewels2, stones2);
        System.out.println(result2);
    }
}