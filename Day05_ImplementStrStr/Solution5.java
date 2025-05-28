package Day05_ImplementStrStr;

public class Solution5 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int result = strStr(haystack, needle);
                System.out.println("Index of \"" + needle + "\" in \"" + haystack + "\": " + result);
            }
        
            private static int strStr(String haystack, String needle) {
                // TODO Auto-generated method stub
                if (needle.isEmpty()) {
                    return 0; // If needle is empty, return 0
                }
                if (haystack.length() < needle.length()) {
                    return -1; // If haystack is shorter than needle, return -1
                }
                for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                    // Check if the substring of haystack starting at index i matches needle
                    if (haystack.substring(i, i + needle.length()).equals(needle)) {
                        return i; // Return the starting index if a match is found
                    }
                }
                return -1; // If no match is found, return -1
                }
            }

