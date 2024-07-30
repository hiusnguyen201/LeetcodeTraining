class Solution {
    public static int maxDepth(String s) {
        /**
         * Runtime: 0 ms
         * Memory: 41.2 MB
         */
        int max = 0, count = 0, length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                max = Math.max(max, count);
                count--;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "(1+(2*3)+((8)/4))+1";
        int result1 = maxDepth(s1);
        System.out.println(result1);

        // Example 2
        String s2 = "(1)+((2))+(((3)))";
        int result2 = maxDepth(s2);
        System.out.println(result2);

        // Example 3
        String s3 = "()(())((()()))";
        int result3 = maxDepth(s3);
        System.out.println(result3);
    }

}