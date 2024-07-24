class Solution {
    public static String reversePrefix(String word, char ch) {
        /**
         * Runtime: 1 ms
         * Memory: 41.9 MB
         */
        int index = word.indexOf(ch);
        if (index == -1)
            return word;

        return new StringBuilder(word.substring(0, index + 1)).reverse().toString()
                + word.substring(index + 1);
    }

    public static void main(String args[]) {
        // Example 1
        String word1 = "abcdefd";
        char ch1 = 'd';
        String result1 = reversePrefix(word1, ch1);
        System.out.println(result1);

        // Example 2
        String word2 = "xyxzxe";
        char ch2 = 'z';
        String result2 = reversePrefix(word2, ch2);
        System.out.println(result2);

        // Example 3
        String word3 = "abcd";
        char ch3 = 'z';
        String result3 = reversePrefix(word3, ch3);
        System.out.println(result3);
    }

}