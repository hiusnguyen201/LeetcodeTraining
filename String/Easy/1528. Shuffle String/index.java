import java.util.HashMap;

class Solution {
    public static String restoreString(String s, int[] indices) {
        /**
         * Runtime: 4 ms
         * Memory: 44.6 MB
         */
        int n = s.length();
        HashMap<Integer, Character> hashMap = new HashMap<Integer, Character>();
        for (int i = 0; i < n; i++) {
            hashMap.put(indices[i], s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : hashMap.values()) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String restoreString2(String s, int[] indices) {
        /**
         * Runtime: 1 ms
         * Memory: 44.4 MB
         */
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        char c[] = new char[n];
        for (int i = 0; i < n; i++) {
            c[indices[i]] = s.charAt(i);
        }
        return sb.append(c).toString();
    }

    public static String restoreString3(String s, int[] indices) {
        /**
         * Runtime: 1 ms
         * Memory: 44.5 MB
         */
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "codeleet";
        int[] indices1 = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String result1 = restoreString3(s1, indices1);
        System.out.println(result1);
    }

}