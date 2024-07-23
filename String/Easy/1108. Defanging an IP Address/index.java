class Solution {
    public static String defangIPaddr(String address) {
        /**
         * Runtime: 0 ms
         * Memory: 41.3 MB
         */
        return address.replace(".", "[.]");
    }

    public static void main(String args[]) {
        // Example 1
        String address1 = "1.1.1.1";
        String result1 = defangIPaddr(address1);
        System.out.println(result1);

        // Example 2
        String address2 = "255.100.50.0";
        String result2 = defangIPaddr(address2);
        System.out.println(result2);
    }

}