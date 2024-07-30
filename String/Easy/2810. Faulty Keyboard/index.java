import java.util.Arrays;

class Solution {
    public static String finalString(String s) {
        /**
         * Runtime: 11 ms
         * Memory: 45.4 MB
         */
        int length = s.length();
        String newStr = "";

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'i') {
                newStr = new StringBuilder(newStr).reverse().toString();
            } else {
                newStr += s.charAt(i);
            }
        }

        return newStr;
    }

    public static String finalString2(String s) {
        /**
         * Runtime: 2 ms
         * Memory: 44.4 MB
         */
        int length = s.length(), j = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < length; i++) {
            if (arr[i] == 'i') {
                reverse(arr, 0, j - 1);
            } else {
                arr[j] = arr[i];
                j++;
            }
        }

        return new String(arr, 0, j);
    }

    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "string";
        String result1 = finalString2(s1);
        System.out.println(result1);

        // // Example 2
        String s2 = "poiinter";
        String result2 = finalString(s2);
        System.out.println(result2);
    }

}