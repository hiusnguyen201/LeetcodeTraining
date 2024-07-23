class Solution {
    public static int findPermutationDifference(String s, String t) {
        /**
         * Runtime: 1 ms
         * Memory: 42.4 MB
         */

        int n = s.length(), result = 0;

        for (int i = 0; i < n; i++) {
            result += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return result;
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "abc", t1 = "bac";
        int result1 = findPermutationDifference(s1, t1);
        System.out.println(result1);

        // Example 2
        String s2 = "abcde", t2 = "edbac";
        int result2 = findPermutationDifference(s2, t2);
        System.out.println(result2);
    }

}