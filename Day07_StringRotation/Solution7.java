package Day07_StringRotation;

public class Solution7 {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean result = isRotation(s1, s2);
        System.out.println("Is \"" + s2 + "\" a rotation of \"" + s1 + "\": " + result);
        }
    private static boolean isRotation(String s1, String s2) {
        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            return false; // If lengths differ, they cannot be rotations
        }
        
        // Concatenate s1 with itself
        String concatenated = s1 + s1;
        
        // Check if s2 is a substring of the concatenated string
        return concatenated.contains(s2);
        }
 
    }

