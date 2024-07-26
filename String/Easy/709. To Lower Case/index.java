class Solution {
    public static String toLowerCase(String s) {
        /**
         * Runtime: 1 ms
         * Memory: 41.7 MB
         */
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) {
                sb.append((char) ((int) s.charAt(i) + 32));
                continue;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static String toLowerCase2(String s) {
        /**
         * Runtime: 0 ms
         * Memory: 41.2 MB
         */

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            }
        }

        return String.valueOf(ch);
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "Hello";
        String result1 = toLowerCase2(s1);
        System.out.println(result1);

        // Example 2
        String s2 = "here";
        String result2 = toLowerCase2(s2);
        System.out.println(result2);

        // Example 3
        String s3 = "LOVELY";
        String result3 = toLowerCase2(s3);
        System.out.println(result3);
    }
}