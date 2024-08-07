class Solution {
    public static int countConsistentStrings(String allowed, String[] words) {
        /**
         * Runtime: 15 ms
         * Memory: 45 MB
         */
        int l = words.length, count = 0;

        for (int i = 0; i < l; i++) {
            boolean isValid = true;
            char[] str = words[i].toCharArray();
            for (int j = 0; j < str.length; j++) {
                if (allowed.indexOf(str[j]) == -1) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        return count;
    }

    public static int countConsistentStrings2(String allowed, String[] words) {
        /**
         * Runtime: 4 ms
         * Memory: 45.2 MB
         */
        boolean[] isAllowed = new boolean[26]; // Constraint: allowed.length <= 26

        for (char c : allowed.toCharArray()) {
            isAllowed[c - 'a'] = true;
        }

        int count = 0;
        for (String word : words) {
            if (isConsistent(word, isAllowed)) {
                count++;
            }
        }

        return count;
    }

    static boolean isConsistent(String word, boolean[] isAllowed) {
        for (int i = 0; i < word.length(); i++) {
            if (!isAllowed[word.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        // Example 1
        String allowed1 = "ab";
        String[] words1 = { "ad", "bd", "aaab", "baa", "badab" };
        int result1 = countConsistentStrings2(allowed1, words1);
        System.out.println(result1);

        // Example 2
        String allowed2 = "abc";
        String[] words2 = { "a", "b", "c", "ab", "ac", "bc", "abc" };
        int result2 = countConsistentStrings2(allowed2, words2);
        System.out.println(result2);

        // Example 3
        String allowed3 = "cad";
        String[] words3 = { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };
        int result3 = countConsistentStrings2(allowed3, words3);
        System.out.println(result3);
    }

}