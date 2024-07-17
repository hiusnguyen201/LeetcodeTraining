import java.util.Arrays;

class Solution {
    public static int minMovesToSeat(int[] seats, int[] students) {
        int length = students.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        int result = 0;

        for (int i = 0; i < length; i++) {
            result += Math.abs(students[i] - seats[i]);
        }

        return result;
    }

    public static void main(String args[]) {
        // Example 1
        int[] seats1 = { 3, 1, 5 };
        int[] students1 = { 2, 7, 4 };
        int result1 = minMovesToSeat(seats1, students1);
        System.out.println(result1);

        // Example 2
        int[] seats2 = { 4, 1, 5, 9 };
        int[] students2 = { 1, 3, 2, 6 };
        int result2 = minMovesToSeat(seats2, students2);
        System.out.println(result2);

        // Example 3
        int[] seats3 = { 2, 2, 6, 6 };
        int[] students3 = { 1, 3, 2, 6 };
        int result3 = minMovesToSeat(seats3, students3);
        System.out.println(result3);

        // Run Time: 3 ms
        // Memory: 43.8 MB
    }

}