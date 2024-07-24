class Solution {
    public static int balancedStringSplit(String s) {
        /**
         * Runtime: 0 ms
         * Memory: 41.5 MB
         */
        int result = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += ((s.charAt(i) == 'R') ? 1 : -1);
            if (sum == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "RLRRLLRLRL";
        int result1 = balancedStringSplit(s1);
        System.out.println(result1);

        // Example 2
        String s2 = "RLRRRLLRLL";
        int result2 = balancedStringSplit(s2);
        System.out.println(result2);

        // Example 3
        String s3 = "LLLLRRRR";
        int result3 = balancedStringSplit(s3);
        System.out.println(result3);
    }

}