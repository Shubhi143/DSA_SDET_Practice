package Day26_AddBinary;

public class Solution26 {
    public static void main(String[] args) {
        String a = "1010"; // Example binary string 1
        String b = "1101"; // Example binary string 2
        String result = addBinary(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
        }
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0; // Initialize carry to 0
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b

        // Loop until both strings are processed and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // Start with the carry

            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Add the current bit of a
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Add the current bit of b
            }

            result.append(sum % 2); // Append the current bit to the result
            carry = sum / 2; // Update carry for the next iteration
        }

        return result.reverse().toString(); // Reverse the result and convert to string
    }
}
