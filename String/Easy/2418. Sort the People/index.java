import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        for (int i = 0; i < n; i++) {
            int max = 0, indexMax = -1;
            for (int j = i; j < n; j++) {
                if (heights[j] > max) {
                    max = heights[j];
                    indexMax = j;
                }
            }

            String temp1 = null;
            temp1 = names[i];
            names[i] = names[indexMax];
            names[indexMax] = temp1;

            int temp2 = 0;
            temp2 = heights[i];
            heights[i] = heights[indexMax];
            heights[indexMax] = temp2;
        }
        return names;
    }

    public static String[] sortPeople2(String[] names, int[] heights) {
        /**
         * Runtime: 7 ms
         * Memory: 45.2 MB
         */
        int n = names.length;
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        for (int i = 0; i < n; i++) {
            hashMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        for (int i = 0; i < n; i++) {
            names[i] = hashMap.get(heights[n - i - 1]);
        }

        return names;
    }

    public static void main(String args[]) {
        // Example 1
        String[] names1 = { "Mary", "John", "Emma" };
        int[] heights1 = { 180, 165, 170 };
        String[] result1 = sortPeople2(names1, heights1);
        System.out.println(Arrays.toString(result1));

        // Example 2
        String[] names2 = { "Alice", "Bob", "Bob" };
        int[] heights2 = { 155, 185, 150 };
        String[] result2 = sortPeople2(names2, heights2);
        System.out.println(Arrays.toString(result2));

    }

}