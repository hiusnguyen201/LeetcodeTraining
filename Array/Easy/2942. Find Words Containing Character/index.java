import java.util.*;

class Solution {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        int length = words.length;
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {
        // Example 1
        String[] words = { "leet", "code" };
        List<Integer> result1 = findWordsContaining(words, 'e');
        System.out.println(result1);

        // Example 2
        String[] words2 = { "abc", "bcd", "aaaa", "cbc" };
        List<Integer> result2 = findWordsContaining(words2, 'a');
        System.out.println(result2);

        // Example 3
        String[] words3 = { "abc", "bcd", "aaaa", "cbc" };
        List<Integer> result3 = findWordsContaining(words3, 'z');
        System.out.println(result3);

        // Run Time: 2 ms
        // Memory: 44.9 MB
    }

}