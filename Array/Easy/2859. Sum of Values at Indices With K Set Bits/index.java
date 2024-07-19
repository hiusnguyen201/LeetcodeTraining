import java.util.Arrays;
import java.util.List;

class Solution {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        /**
         * Run Time: 1 ms
         * Memory: 44.3 MB
         */
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    // The func bitCount() build like this
    public static int getBitCount(int number) {
        int bitCount = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                bitCount++;
            }
            number /= 2;
        }
        return bitCount;
    }

    public static void main(String args[]) {
        // Example 1
        List<Integer> num1 = Arrays.asList(5, 10, 1, 5, 2);
        int k1 = 1;
        int result1 = sumIndicesWithKSetBits(num1, k1);
        System.out.println(result1);

        // Example 2
        List<Integer> num2 = Arrays.asList(4, 3, 2, 1);
        int k2 = 2;
        int result2 = sumIndicesWithKSetBits(num2, k2);
        System.out.println(result2);
    }

}