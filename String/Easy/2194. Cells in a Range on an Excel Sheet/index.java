import java.util.*;

class Solution {
    public static List<String> cellsInRange(String s) {
        /**
         * Runtime: 5 ms
         * Memory: 44.6 MB
         */
        List<String> l = new ArrayList<String>();
        char[] arr = s.toCharArray();

        for (int i = arr[0]; i <= arr[3]; i++) {
            for (int j = arr[1]; j <= arr[4]; j++) {
                l.add((char) i + "" + (j - 48));
            }
        }

        return l;
    }

    public List<String> cellsInRange2(String s) {
        /**
         * Runtime: 0 ms
         * Memory: 44.9 MB
         */
        int nCols = s.charAt(3) - s.charAt(0) + 1;
        int nRows = s.charAt(4) - s.charAt(1) + 1;
        return new java.util.AbstractList<String>() {
            public String get(int index) {
                char col = (char) (s.charAt(0) + index / nRows);
                char row = (char) (s.charAt(1) + index % nRows);
                return new String(new char[] { col, row });
            }

            public int size() {
                return nRows * nCols;
            }
        };
    }

    public static void main(String args[]) {
        // Example 1
        String s1 = "K1:L2";
        List<String> result1 = cellsInRange(s1);
        System.out.println(result1);
    }

}