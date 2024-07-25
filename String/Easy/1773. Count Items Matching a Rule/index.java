import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String[] keys = { "type", "color", "name" };

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        /**
         * Runtime: 4 ms
         * Memory: 50.5 MB
         */

        int indexRule = Arrays.asList(keys).indexOf(ruleKey);

        int count = 0;
        for (List<String> item : items) {
            if (item.get(indexRule).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        // Example 1
        List<List<String>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Arrays.asList("phone", "blue", "pixel")));
        lists.add(new ArrayList<>(Arrays.asList("computer", "silver", "phone")));
        lists.add(new ArrayList<>(Arrays.asList("phone", "gold", "iphone")));

        String ruleKey1 = "color";
        String ruleValue1 = "silver";
        int result1 = countMatches(lists, ruleKey1, ruleValue1);
        System.out.println(result1);

        // Example 2
        String ruleKey2 = "type";
        String ruleValue2 = "phone";
        int result2 = countMatches(lists, ruleKey2, ruleValue2);
        System.out.println(result2);
    }

}