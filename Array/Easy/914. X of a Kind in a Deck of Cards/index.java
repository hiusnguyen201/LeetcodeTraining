import java.util.HashMap;

class Solution {
    public static boolean hasGroupsSizeX(int[] deck) {
        /**
         * Runtime: 11 ms
         * Memory: 45.5 MB
         */

        // Hashmap to store cards and the number of times they occurr
        HashMap<Integer, Integer> hash = new HashMap<>();

        // Loop through the deck building the hashmap
        for (int i = 0; i < deck.length; i++) {
            hash.put(deck[i], hash.getOrDefault(deck[i], 0) + 1);
        }

        // Get the lowest count value of a card
        int lowest = Integer.MAX_VALUE;
        for (int i : hash.keySet()) {
            lowest = Math.min(lowest, hash.get(i));
        }

        // Iterate from lowest integer down to 2 to see
        // if a least common denominator exists
        for (int i = lowest; i >= 2; i--) {
            // Flag to detect if a number is a lcd
            boolean lcd = true;

            // Loop through the HashMap
            for (int j : hash.keySet()) {
                if (hash.get(j) % i != 0)
                    lcd = false;
            }

            // If lcd is true, then the j value can divide all items in hash
            if (lcd == true)
                return true;
        }

        return false;
    }

    public static void main(String args[]) {
        // Example 1
        int[] deck1 = { 1, 2, 3, 4, 4, 3, 2, 1 };
        boolean result1 = hasGroupsSizeX(deck1);
        System.out.println(result1);

        // Example 2
        int[] deck2 = { 1, 1, 1, 2, 2, 2, 3, 3 };
        boolean result2 = hasGroupsSizeX(deck2);
        System.out.println(result2);

        // Example 3
        int[] deck3 = { 1, 1 };
        boolean result3 = hasGroupsSizeX(deck3);
        System.out.println(result3);

        // Example 4
        int[] deck4 = { 0, 0, 0, 1, 1, 1, 2, 2, 2 };
        boolean result4 = hasGroupsSizeX(deck4);
        System.out.println(result4);

        // Example 5
        int[] deck5 = { 0, 0, 0, 0, 1, 1, 2, 2, 3, 3 };
        boolean result5 = hasGroupsSizeX(deck5);
        System.out.println(result5);

        // Example 6
        int[] deck6 = { 1, 1, 2, 2, 2, 2 };
        boolean result6 = hasGroupsSizeX(deck6);
        System.out.println(result6);

        // Example 7
        int[] deck7 = { 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 3, 3, 4, 5, 6 };
        boolean result7 = hasGroupsSizeX(deck7);
        System.out.println(result7);

        // Example 8
        int[] deck8 = { 0, 0, 1, 1, 1, 1, 2, 2, 3, 4 };
        boolean result8 = hasGroupsSizeX(deck8);
        System.out.println(result8);

        // Example 9
        int[] deck9 = { 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 3, 3, 4, 5, 6 };
        boolean result9 = hasGroupsSizeX(deck9);
        System.out.println(result9);
    }

}