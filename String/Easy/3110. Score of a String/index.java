class Solution {
    public static int scoreOfString(String s) {
        /**
         * Runtime: 1 ms
         * Memory: 42.2 MB
         */
        int result = 0, length = s.length();

        for (int i = 1; i < length; i++) {
            result += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }

        return result;
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "hello";
        int result1 = scoreOfString(s1);
        System.out.println(result1);

        // Example 1
        String s2 = "zaz";
        int result2 = scoreOfString(s2);
        System.out.println(result2);
    }

}