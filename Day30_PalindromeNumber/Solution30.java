package Day30_PalindromeNumber;

public class Solution30 {
    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
        }
    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversed = 0;
        int original = x;
        
        // Reverse the number
        while (x > 0) {
            int digit = x % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            x /= 10; // Remove the last digit from x
        }
        
        // Check if the original number is equal to the reversed number
        return original == reversed;
    }
}
