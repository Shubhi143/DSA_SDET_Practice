package Day29_ReverseInteger;

public class Solution29 {
    public static void main(String[] args) {
        int x = 123;
        int result = reverse(x);
        System.out.println("Reversed integer: " + result);
        }
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10; // Get the last digit
            x /= 10; // Remove the last digit from x
            
            // Check for overflow/underflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }
            
            reversed = reversed * 10 + digit; // Build the reversed number
        }
        return reversed;
    }
}
