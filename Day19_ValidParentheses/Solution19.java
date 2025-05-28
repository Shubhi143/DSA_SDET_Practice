package Day19_ValidParentheses;

public class Solution19 {
    public static void main(String[] args) {
        String s = "([{}])";
        boolean result = isValid(s);
        System.out.println("Is the string \"" + s + "\" valid? " + result);
        }
    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false; // If the string is null or has an odd length, it cannot be valid
        }

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    return false; // If stack is empty but we encounter a closing bracket, it's invalid
                }
                char top = stack.pop(); // Pop the top element from the stack
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }

        return stack.isEmpty(); // If the stack is empty, all brackets were matched correctly
        
    }
}
