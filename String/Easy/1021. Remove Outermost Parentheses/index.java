class Solution {
    public static String removeOuterParentheses(String s) {
        /**
         * Runtime: 6 ms
         * Memory: 45.4 MB
         */
        int sum = 0, startIndex = 0;
        String newStr = "";

        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.charAt(i);

            if (sum % 81 == 0) {
                sum = 0;
                newStr += (String) s.substring(startIndex + 1, i);
                startIndex = i + 1;
            }
        }

        return newStr;
    }

    static public String removeOuterParentheses2(String s) {
        /**
         * Runtime: 2 ms
         * Memory: 42 MB
         */
        char[] arr = s.toCharArray();
        int count = 1, length = arr.length, i = 1;
        // Count = 1 because the first index always is "("
        StringBuilder newStr = new StringBuilder();

        while (i < length) {
            if (arr[i] == '(') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                i += 2;
                count = 1;
            } else {
                newStr.append(arr[i]);
                i++;
            }
        }

        return newStr.toString();
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "(()())(())";
        String result1 = removeOuterParentheses2(s1);
        System.out.println(result1);

        // Example 2
        String s2 = "(()())(())(()(()))";
        String result2 = removeOuterParentheses2(s2);
        System.out.println(result2);

        // Example 3
        String s3 = "()()";
        String result3 = removeOuterParentheses2(s3);
        System.out.println(result3);
    }
}