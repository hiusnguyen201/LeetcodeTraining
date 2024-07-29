class Solution {
    public static String firstPalindrome(String[] words) {
        /**
         * Runtime: 2ms
         * Memory: 44.7 MB
         */
        int length = words.length;
        for (int i = 0; i < length; i++) {
            int lengthChild = words[i].length();
            int count = 0;
            for (int j = 0; j < lengthChild / 2; j++) {
                if (words[i].charAt(j) != words[i].charAt(lengthChild - j - 1)) {
                    break;
                } else {
                    count++;
                }
            }

            if (Math.floor(lengthChild / 2) == count) {
                return words[i];
            }
        }

        return "";
    }

    // Solution 2
    public static boolean isPalindrome2(String words) {
        int left = 0, right = words.length() - 1;
        while (left <= right) {
            if (words.charAt(left) != words.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String firstPalindrome2(String[] words) {
        /**
         * Runtime: 1ms
         * Memory: 45 MB
         */
        int length = words.length;
        for (int i = 0; i < length; i++) {
            if (isPalindrome2(words[i])) {
                return words[i];
            }
        }

        return "";
    }

    public static void main(String args[]) {
        // Example 1
        String[] words1 = { "abc", "car", "ada", "racecar", "cool" };
        String result1 = firstPalindrome2(words1);
        System.out.println(result1);

        // Example 2
        String[] words2 = { "notapalindrome", "racecar" };
        String result2 = firstPalindrome2(words2);
        System.out.println(result2);

        // Example 3
        String[] words3 = { "def", "ghi" };
        String result3 = firstPalindrome2(words3);
        System.out.println(result3);
    }

}