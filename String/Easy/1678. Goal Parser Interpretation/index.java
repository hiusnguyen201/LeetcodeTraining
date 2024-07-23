class Solution {
    public static String interpret(String command) {
        /**
         * Runtime: 1 ms
         * Memory: 41.6 MB
         */
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static String interpret2(String command) {
        /**
         * Runtime: 0 ms
         * Memory: 41.5 MB
         */
        StringBuilder builder = new StringBuilder(command.length());

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                builder.append("G");
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    builder.append("o");
                    // ")" -> skip 1 index
                    i++;
                } else {
                    builder.append("al");
                    // "al)" -> skip 3 index
                    i = i + 3;
                }
            }
        }

        return builder.toString();
    }

    public static void main(String args[]) {
        // Example 1
        String command1 = "G()(al)";
        String result1 = interpret2(command1);
        System.out.println(result1);

        // Example 2
        String command2 = "G()()()()(al)";
        String result2 = interpret2(command2);
        System.out.println(result2);

        // Example 3
        String command3 = "(al)G(al)()()G";
        String result3 = interpret2(command3);
        System.out.println(result3);
    }

}