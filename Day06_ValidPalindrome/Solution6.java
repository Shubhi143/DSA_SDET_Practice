package Day06_ValidPalindrome;

public class Solution6 {
    
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        String s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(s);
        System.out.println("Is \"" + s + "\" a valid palindrome? " + result);
        }
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true; // An empty string is a valid palindrome
        }

        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c)); // Convert to lowercase and append
            }
        }

        String str = filteredString.toString();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }

        return true; // If no mismatches found, it is a valid palindrom
    
    }
}
