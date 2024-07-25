class Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        /**
         * Runtime: 1 ms
         * Memory: 41.3 MB
         */
        return String.join("", word1).equals(String.join("", word2));
    }

    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        /**
         * Runtime: 0 ms
         * Memory: 41.5 MB
         */
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (String word : word1) {
            str1.append(word);
        }

        for (String word : word2) {
            str2.append(word);
        }

        return str1.toString().equals(str2.toString());
    }

    public static void main(String args[]) {
        // Example 1
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        boolean result1 = arrayStringsAreEqual(word1, word2);
        System.out.println(result1);
    }

}