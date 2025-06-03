public class Solution31 {
    public static void main(String[] args) {
     
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: \"" + result + "\"");
    }
    public static String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) {
            return ""; // Return empty string if input is null or empty
        }
        
        String prefix = strs[0]; // Start with the first string as the prefix
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Check if the current prefix is not a prefix of strs[i]
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix by one character
                if (prefix.isEmpty()) {
                    return ""; // If the prefix becomes empty, return empty string
                }
            }
        }
        
        return prefix; // Return the longest common prefix found
    }
}