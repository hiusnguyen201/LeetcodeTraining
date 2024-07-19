class Solution {
    public static int mostWordsFound(String[] sentences) {
        /**
         * Run Time: 3 ms
         * Memory: 44 MB
         */
        int maxWords = 0;

        for (String sentence : sentences) {
            int wordLength = sentence.split(" ").length;
            if (wordLength > maxWords)
                maxWords = wordLength;
        }

        return maxWords;
    }

    public static void main(String args[]) {
        // Example 1
        String[] sentences1 = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int result1 = mostWordsFound(sentences1);
        System.out.println(result1);

        // Example 2
        String[] sentences2 = { "please wait", "continue to fight", "continue to win" };
        int result2 = mostWordsFound(sentences2);
        System.out.println(result2);
    }

}