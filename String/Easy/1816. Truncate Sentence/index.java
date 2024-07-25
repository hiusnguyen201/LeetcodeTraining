import java.util.Arrays;

class Solution {
    public static String truncateSentence(String s, int k) {
        /**
         * Runtime: 2 ms
         * Memory: 41.6 MB
         */
        String[] splitArr = s.split(" ");

        if (k >= splitArr.length) {
            return s;
        }

        return String.join(" ", Arrays.copyOfRange(splitArr, 0, k));
    }

    public static String truncateSentence2(String s, int k) {
        /**
         * Runtime: 0 ms
         * Memory: 41.5 MB
         */
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k--;
            }

            if (k == 0) {
                return s.substring(0, i);
            }
        }

        return s;
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "Hello how are you Contestant";
        char k1 = 4;
        String result1 = truncateSentence(s1, k1);
        System.out.println(result1);
    }

}